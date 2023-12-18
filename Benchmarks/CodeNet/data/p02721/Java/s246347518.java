import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        ArrayList<ArrayList<Integer>> days = new ArrayList<>();
        boolean flag = false;
        int start = 0;
        ArrayList<Integer> cur = null;
        for (int i = 0; i < n; i++) {
            if (i - start > c) {
                flag = false;
            }
            if (flag) {
                if (arr[i] == 'o') {
                    cur.add(i);
                }
            } else {
                if (arr[i] == 'o') {
                    cur = new ArrayList<>();
                    days.add(cur);
                    cur.add(i);
                    flag = true;
                    start = i;
                }
            }
        }
        for (int i = 1; i < days.size(); i++) {
            ArrayList<Integer> next = days.get(i);
            ArrayList<Integer> bef = days.get(i - 1);
            int x = next.get(next.size() - 1);
            for (int j = bef.size() - 1; j >= 0; j--) {
                if (x - bef.get(j) > c) {
                    break;
                }
                bef.remove(j);
            }
            if (bef.size() == 0) {
                days.remove(i - 1);
                i--;
            }
        }
        if (days.size() > k) {
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (ArrayList<Integer> list : days) {
            if (list.size() == 1) {
                sb.append(list.get(0) + 1).append("\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println();
        } else {
            System.out.print(sb);
        }
    }
}
