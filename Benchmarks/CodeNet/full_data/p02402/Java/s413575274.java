import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int max, min, sum = 0;

        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < a.length; i++) {
        sum += a[i];
        }

        Arrays.sort(a);
        max = a[n-1];
        min = a[0];

        System.out.println(min + " " + max + " " + sum);
    }
}