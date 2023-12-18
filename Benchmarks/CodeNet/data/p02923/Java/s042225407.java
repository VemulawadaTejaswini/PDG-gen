import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {

        int N = in.nextInt();
        int[] SQ = new int[N];

        for (int i = 0; i < N; i++) {
            SQ[i] = in.nextInt();
        }
        int count = 0;
        int curSum = 0;
        for (int i = 1; i < SQ.length; i++) {
            if (SQ[i-1] >= SQ[i]) {
                curSum++;
                count = Math.max(curSum, count);
            } else {
                curSum = 0;
            }
        }

        return String.valueOf(count);
      }
}