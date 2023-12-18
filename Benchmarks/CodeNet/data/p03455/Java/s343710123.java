import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();

        a=a*b;
        if (a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
