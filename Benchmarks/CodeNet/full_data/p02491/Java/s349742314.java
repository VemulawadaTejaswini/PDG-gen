import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int a,b;
        a=input.nextInt();
        b=input.nextInt();
        System.out.printf("%d %d %f\n",a/b,a%b,(double)a/b);
    }
}