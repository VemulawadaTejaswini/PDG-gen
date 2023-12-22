import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        double pi = 3.1415926535;
        int r = sc.nextInt();
        
        System.out.println(r*r*pi + " " + r*2*pi);
    }
}