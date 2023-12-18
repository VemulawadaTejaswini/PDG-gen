import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0;i < n;i++) p[i] = sc.nextInt();
        int[] q = new int[n];
        for(int i = 0;i < n;i++) q[i] = sc.nextInt();
        List<List<Integer>> perms = new ArrayList<>();
        List<Integer> candidate = new ArrayList<>();
        for(int i = 1;i <= n;i++) candidate.add(i);
        
        searchRoute(candidate, new ArrayList<>(), perms);
        
        int a = 0;
        int b = 0;
        for(int i = 0;i < perms.size();i++) {
            List<Integer> perm = perms.get(i);
            boolean isA = true;
            boolean isB = true;
            for(int j = 0;j < perm.size();j++) {
                if(perm.get(j).intValue() != p[j]) isA = false;
                if(perm.get(j).intValue() != q[j]) isB = false;
            }
            if(isA) a = i;
            if(isB) b = i;
        }

        int ans = Math.abs(a - b);
        System.out.println(ans);
    }

    private static void searchRoute(List<Integer> candidate, List<Integer> perm, List<List<Integer>> result) {
        if(candidate.isEmpty()) {
            result.add(perm);
        }

        for(int i = 0;i < candidate.size();i++) {
            Integer tmp = candidate.get(i);
            List<Integer> tmpCandidate = new ArrayList<>(candidate);
            List<Integer> tmpRoute = new ArrayList<>(perm);
            tmpCandidate.remove(i);
            tmpRoute.add(tmp);
            searchRoute(tmpCandidate, tmpRoute, result);
        }

        return;
    }

}
