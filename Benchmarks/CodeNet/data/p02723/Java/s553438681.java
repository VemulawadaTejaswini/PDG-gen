import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class demodemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int b1 = n - 2;
//            int b2 = n - 1;
//            int c = 1;
//            while (c++ != k) {
//                if (b1 + 1 == b2) {
//                    b2 = n - 1;
//                    b1--;
//                } else {
//                    b2--;
//                }
//            }
//            char[] arr = new char[n];
//            Arrays.fill(arr, 'a');
//            arr[b1] = 'b';
//            arr[b2] = 'b';
//            System.out.println(new String(arr));
//        }
        String s = sc.nextLine();
        if (s.charAt(3) == s.charAt(4) && s.charAt(5) == s.charAt(6) && s.charAt(3) != s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
