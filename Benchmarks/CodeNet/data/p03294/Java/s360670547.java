import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int res = 0;

        for (int i = 0; i < N; i++) {
            res += sc.nextInt() - 1;
        }
        
        System.out.println(res);


    }

}
