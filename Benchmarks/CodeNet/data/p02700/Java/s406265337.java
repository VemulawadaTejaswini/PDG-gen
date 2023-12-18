import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(); double B = sc.nextDouble(); double C = sc.nextDouble(); double D = sc.nextDouble();

        if(Math.ceil(A/D)>=Math.ceil(C/B)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        sc.close();
    }
}