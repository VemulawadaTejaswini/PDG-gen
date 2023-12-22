import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;

public class Main{
    public static Random rand = new Random();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long start = System.currentTimeMillis();
        int D = Integer.parseInt(sc.next());
        int[] C = new int[26];
        int[] L = new int[26];
        for (int i = 0; i < 26; i++){
            C[i] = Integer.parseInt(sc.next());
            L[i] = 0;
        }
        int[][] S = new int[D][26];
        for (int i = 0; i < D; i++){
            for (int j = 0; j < 26; j++){
                S[i][j] = Integer.parseInt(sc.next());
            }
        }
        int[] Ans = new int[D];
        for (int i = 0; i < D; i++){
            Ans[i] = (i % 26) + 1;
        }
        int maxPoint = calcPoint(Ans, S, C, L, D);
        

        while (System.currentTimeMillis() - start < 1850){
            maxPoint = change(Ans, S, C, L, D, maxPoint, 1500 - (System.currentTimeMillis() - start));
        }

        for (int i = 0; i < D; i++){
            out.print(Ans[i]);
            out.print("\n");
        }
        //template
        sc.close();
        out.flush();
    }

    public static int calcPoint(int[] Ans, int[][] S, int[] C, int[] L, int D){
        int point = 0;
        for (int i = 0; i < 26; i++){
            L[i] = 0;
        }
        for (int i = 0; i < D; i++){
            point += S[i][Ans[i] - 1];
            L[Ans[i] - 1] = i + 1;
            for (int j = 0; j < 26; j++){
                point -= C[j] * (i + 1 - L[j]);
            }
        }
        return point;
    }

    public static int change(int[] Ans, int[][] S, int[] C, int[] L, int D, int maxPoint, long t){
        int ci = rand.nextInt(D);
        int before = Ans[ci];
        Ans[ci] = rand.nextInt(26) + 1;
        int newPoint = calcPoint(Ans, S, C, L, D);
        if (newPoint < maxPoint){
            if (rand.nextInt(1900) < t){
                return newPoint;
            }
            else{
                Ans[ci] = before;
            return maxPoint;
            }    
        }
        else{
            return newPoint;
        }
    }
}