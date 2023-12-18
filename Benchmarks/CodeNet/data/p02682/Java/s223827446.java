import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long A = scan.nextLong();
                long B = scan.nextLong();
                long C = scan.nextLong();
                long K = scan.nextLong();

                long count = 0;

                while (K > 0) {
                        if (A > 0) {
                                count++;
                                A--;
                                K--;
                        } else if (B > 0) {
                                B--;
                                K--;
                        } else if (C > 0) {
                                count--;
                                C--;
                                K--;
                        }
                }

                System.out.println(count);

        }
}