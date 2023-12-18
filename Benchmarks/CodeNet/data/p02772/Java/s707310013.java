import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            if (i % 2 == 1) continue;
            if (i %3 != 0 && i%5 != 0 ){
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}
