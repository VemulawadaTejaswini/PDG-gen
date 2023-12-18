import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[2] - a[0]);
    }
}