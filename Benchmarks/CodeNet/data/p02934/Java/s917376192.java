import java.util.Scanner;
//import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        double[] a = new double[n];
        for(int i = 0;i < n;i++){
            a[i] = stdIn.nextDouble();
            a[i] = 1 / a[i];
        }
        double x = 0;
        for(int i = 0;i < n;i++){
            x += a[i];
        }
        System.out.println(1 / x);
        
        
    }

}