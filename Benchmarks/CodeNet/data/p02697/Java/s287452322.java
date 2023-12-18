import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();

                int count1 = 1;
                int count2 = N;

                while (M > 0) {
                        System.out.println(count1+" "+count2);
                        if (N/4 == count1) {count2--;}
                        count1++;
                        count2--;
                        M--;
                }
        }
}