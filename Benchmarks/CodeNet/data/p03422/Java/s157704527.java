import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        // PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int Takahashi = 0; // player1

        int Aoki = 0; // player2

        for(int i=0; i<n; i++) {
          StringTokenizer st = new StringTokenizer(bf.readLine());
          int a = Integer.parseInt(st.nextToken());
          int k = Integer.parseInt(st.nextToken());


            if(whoWins(a, k)) Takahashi++;
            else Aoki++;




        }
        Takahashi %= 2;
        if(Takahashi == 1) System.out.println("Takahashi");
        else System.out.println("Aoki");

    //  for(int i=1; i<=30; i++) {
      //  System.out.println(i + ", 3: " + whoWins(i, 3));
      //}
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        // out.close(); System.exit(0);
    }
    public static boolean whoWins(int a, int k) {
      if(k == 1) return true;
      else {
        int cur = 1;
        while(cur < a) {
          int low = cur+1;
          int high = 1000000000;
          while(low < high) {
            int mid = (low + high)/2;
            if(mid - 1 - mid/k >= cur)
              high = mid;
            else low = mid+1;

          }
          cur = low;
        }

        return (cur > a);
      }


    }

}
