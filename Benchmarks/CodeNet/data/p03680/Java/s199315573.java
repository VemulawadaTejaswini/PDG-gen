import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int [a+1];
        for(int i=1; i<=a; i++) {
            b[i] = sc.nextInt();
        }
        int next = 1;
        for(int i=1; i<=1000000; i++) {
            if(b[next] == 2) {
                System.out.println(i);
                return;
            }
            next = b[next];
        }
        System.out.println("-1");
    }
}