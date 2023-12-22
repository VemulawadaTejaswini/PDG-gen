import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main{
    static Random rand = new Random();
    static int D;
    static long start;
    static int[] C = new int[26];
    static int[] L = new int[26];
    static int[][] S;
    static int[] Ans;
    static ArrayList<ArrayList<Integer>> AP = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        start = System.currentTimeMillis();
        D = Integer.parseInt(sc.next());
        for (int i = 0; i < 26; i++){
            C[i] = Integer.parseInt(sc.next());
            L[i] = 0;
            AP.add(new ArrayList<Integer>());
        }

        S = new int[D][26];
        Ans = new int[D];
        for (int i = 0; i < D; i++){
            int maxS = -10 ^ 9;
            for (int j = 0; j < 26; j++){
                S[i][j] = Integer.parseInt(sc.next());
                if (S[i][j] > maxS){
                    maxS = S[i][j] + C[j] * (i + 1 - L[i]);
                    Ans[i] = j + 1;
                }
            }
            L[Ans[i] - 1] = i + 1;
            AP.get(Ans[i] - 1).add(i + 1);
        }
        int maxPoint = calcPoint();
        

        while (System.currentTimeMillis() - start < 1850){
            if (rand.nextInt(2) == 0){
                maxPoint = change(maxPoint, 1500 - 1500 * (System.currentTimeMillis() - start) / 1850);
            }
            else{
                maxPoint = swap(maxPoint, 1500 - 1500 * (System.currentTimeMillis() - start) / 1850);
            }
            
        }

        for (int i = 0; i < D; i++){
            out.print(Ans[i]);
            out.print("\n");
        }
        //out.println(maxPoint);
        //template
        sc.close();
        out.flush();
    }

    public static double getTemp(int newScore, int preScore, double t){
        return Math.exp((newScore - preScore) / t);
    }

    public static int calcPoint(){
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

    public static int change(int maxPoint, double t){
        int ci = rand.nextInt(D);
        int before = Ans[ci];
        Ans[ci] = rand.nextInt(26) + 1;
        int newPoint = calcPoint();
        double prob = getTemp(newPoint, maxPoint, t);
        if (prob > rand.nextInt(2 ^ 10) / (2 ^ 10)){
            return newPoint;
        }
        else{
            Ans[ci] = before;
            return maxPoint;
        }
    }

    public static int swap(int maxPoint, double t){
        int ci = rand.nextInt(D);
        int cj = rand.nextInt(D);
        while (ci == cj | Math.abs(ci - cj) > 5){
            cj = rand.nextInt(D);
        }
        int temp = Ans[cj];
        Ans[cj] = Ans[ci];
        Ans[ci] = temp;

        int newPoint = calcPoint();
        double prob = getTemp(newPoint, maxPoint, t);
        if (prob > rand.nextInt(2 ^ 10) / (2 ^ 10)){
            return newPoint;
        }
        else{
            Ans[ci] = Ans[cj];
            Ans[cj] = temp;
            return maxPoint;
        }
    }
}
