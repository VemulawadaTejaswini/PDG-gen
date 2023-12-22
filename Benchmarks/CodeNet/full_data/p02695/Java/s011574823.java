import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for(int i = 0;i < q;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        List<int[]> AList = new ArrayList<>();
        dfs(new int[n], 0, m, AList);

        int maxScore = 0;
        for(int i = 0;i < AList.size();i++) {
            int[] A = AList.get(i);
            int score = 0;
            for(int j = 0;j < q;j++) {
                if(A[b[j] - 1] - A[a[j] - 1] == c[j]) score += d[j];
            }

            if(score > maxScore) maxScore = score;
        }

        System.out.println(maxScore);
    }

    private static void dfs(int[] a, int idx, int m, List<int[]> result) {
        if(idx >= a.length) {
            result.add(a);
            return;
        }

        int preA = ((idx - 1) >= 0 ? a[idx - 1] : 1);
        for(int i = preA;i <= m;i++) {
            int[] newA = new int[a.length];
            for(int j = 0;j < a.length;j++) newA[j] = a[j];
            newA[idx] = i;
            dfs(newA, idx + 1, m, result);
        }

        return;
    }
}
