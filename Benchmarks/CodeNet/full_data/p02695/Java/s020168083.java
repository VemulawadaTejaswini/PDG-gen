import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] query = new int[q][4];

        for(int i = 0; i < q; i++){
            query[i][0] = sc.nextInt() -1;
            query[i][1] = sc.nextInt() -1;
            query[i][2] = sc.nextInt();
            query[i][3] = sc.nextInt();
        }

        solve(n, m, q, query);

        System.out.println(answer);

    }
    static void solve(int n, int m, int q, int[][] query){
        int[] a = new int[n];
        Arrays.fill(a, 0);
        solveSub(a, m, 0, q, query);
    }

    static void solveSub(int[] a, int m, int index, int q, int[][] query){
        if(index < a.length){
            int start = 0;
            if(index != 0) start = a[index - 1];
            for(int i = start; i < m; i++ ){
                a[index] = i;
                solveSub(a, m, index + 1, q, query);
            }
        } else {
            answer = Math.max(answer, score(a, q, query));
        }
    }

    static int score(int[] a, int q, int[][] query){
        int score = 0;
        for(int i = 0; i < q; i++){
            if(query[i][2] == (a[query[i][1]] + 1) - (a[query[i][0]] + 1)) score += query[i][3];
        }
        return score;
    }
}