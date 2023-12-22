import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c=(int) a;
        int d=(int)b;
        double r=(double)a/b;
        System.out.printf("%d %d %f\n",a,b,r);
        
    }
}