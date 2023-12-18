import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] c = new int[n];
        int[][] a = new int[n][m];
        int[] sum = new int[m];
        List<Integer> idx = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            idx.add(i);
            int cc = Integer.parseInt(sc.next());
            c[i] = cc;
            List<Integer> templist = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(sc.next());
                a[i][j] = temp;
                sum[j] += temp;
                templist.add(temp);
            }
            list.add(templist);
        }
        for (int i = 0; i < m; i++) {
            if (sum[i] < x) {
                System.out.println(-1);
                return;
            }
        }
        List<List<List<Integer>>> numList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numList.add(Combination1.make(idx, i));
        }
        for (int i = 0; i < numList.size(); i++) {
            List<List<Integer>> tempList = numList.get(i);
            for (int j = 0; j < tempList.size(); j++) {
                List<Integer> tempList2 = tempList.get(j);
                int[] tempSum = new int[m];
                int tempAns = 0;
                for (int k = 0; k < tempList2.size(); k++) {
                    tempAns += c[tempList2.get(k)];
                    for (int l = 0; l < list.get(k).size(); l++) {
                        tempSum[l] += list.get(tempList2.get(k)).get(l);
                    }
                }
                boolean isOK = true;
                for (int k = 0; k < m; k++) {
                    if (tempSum[k] < x) {
                        isOK = false;
                        break;
                    }
                }
                if (isOK) {
                    ans = Math.min(ans, tempAns);
                }
            }
        }
        System.out.println(ans);
    }

    private static class Combination1 {
        public static List<List<Integer>> make(List<Integer> candidate, int r) {
            if (candidate.size() < r || candidate.size() <= 0 || r <= 0) {
                List<List<Integer>> empty = new ArrayList<>();
                empty.add(new ArrayList<>());
                return empty;
            }

            List<List<Integer>> combination = new ArrayList<>();
            for (int i = 0; i <= candidate.size() - r; i++) {
                Integer picked = candidate.get(i);
                List<Integer> rest = new ArrayList<>(candidate);
                rest.subList(0, i + 1).clear();
                combination.addAll(make(rest, r - 1).stream().map(list -> {
                    list.add(0, picked);
                    return list;
                }).collect(Collectors.toList()));
            }
            return combination;
        }
    }
}