import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        
        int s = X-(K-1);
        int e = X+(K-1);
        if (K==1) {
            System.out.println(X);
        } else {
            for (int i=s; i<=e; i++) {
                System.out.println(i);
            }
        }
    }
}