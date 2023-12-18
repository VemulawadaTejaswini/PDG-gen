import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();

            int[] a = new int[3];
            a[0] = n / 100;
            a[1] = n % 100;
            a[2] = a[1] % 10;
            a[1] = a[1] /10;

            int m = Integer.max(a[0], Integer.max(a[1], a[2]));

            System.out.println(m * 100 + m * 10 + m);
        }
    }
}