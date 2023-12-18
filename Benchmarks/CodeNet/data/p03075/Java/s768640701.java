import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        int k = scanner.nextInt();
        scanner.close();
        //solve

        // output
        if (Math.abs(a[0]-a[4])<=k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }        
        System.out.flush();
    }
}