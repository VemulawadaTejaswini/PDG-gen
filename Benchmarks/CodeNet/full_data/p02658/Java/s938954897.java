import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[] b = new long[a];
        long total = 1;
        for(int i =0; i<a; i++) {
            b[i] = sc.nextLong();
            total *= b[i];
        }
        if(Math.pow(10, 18) < total) {
            System.out.println("-1");
        } else {
            System.out.println(total);
        }
    }
}