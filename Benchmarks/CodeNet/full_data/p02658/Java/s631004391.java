import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[] b = new long[a];
        long total = 1;
        for(int i =0; i<a; i++) {
            b[i] = sc.nextLong();
            if(b[i] == 0) {
                System.out.println("0");
                return;
            }
        }
        long c = (long) Math.pow(10, 18);
        for(int i =0; i<a; i++) {
            if(b[i] > c/total ) {
                System.out.println("-1");
                return;
            }
            total *= b[i];
        }
        System.out.println(total);
    }
}