import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if(n==1){
            System.out.println("1.0000000000");
            return;
        }else if(n % 2 == 0){
            System.out.println("0.5000000000");
        }else {
            System.out.println(((n+1)/2) /n);
        }



    }
}