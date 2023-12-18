import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long A = scan.nextLong();
                long B = scan.nextLong();
                long C = scan.nextLong();
                long K = scan.nextLong();

                if (K <= A + B) {
                        System.out.println(A);
                } else {
                        System.out.println(2*A+B-K);
                }
        }
}