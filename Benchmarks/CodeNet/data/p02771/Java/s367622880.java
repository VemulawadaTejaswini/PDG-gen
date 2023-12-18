import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
        int A= in.nextInt();
        int B = in.nextInt();
        int C= in.nextInt();

        Map<Integer, Integer> checker = new HashMap<>();
        checker.put(A, checker.getOrDefault(A, 0) + 1);
        checker.put(B, checker.getOrDefault(B, 0) + 1);
        checker.put(C, checker.getOrDefault(C, 0) + 1);

        for (int c: checker.keySet()) {
            if (checker.get(c) == 2) return "Yes";
        }
        return "No";
      }
      
    
}