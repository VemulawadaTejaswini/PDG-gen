import java.util.*;
//import java.io.*;
import java.util.stream.IntStream;

public class Main{
    static int minR = Integer.MAX_VALUE;
    static int maxL = 0;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        int m = sc.nextInt();
        int L[] = new int[m];
        int R[] = new int[m];
        //全ての区間[Li,Ri]に入っている数字の数+1が答え
        IntStream.range(0, m).forEach(i -> {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            minR = Math.min(R[i],minR);
            maxL = Math.max(L[i],maxL);
        });

        int ans= minR - maxL + 1;
        System.out.println(ans);

    }
}