import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[]a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = stdIn.nextInt();
        }
        for(int i = n - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }
}
