import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int c=(int) a;
        int d=(int)b;
        System.out.println((c/d)+" "+(c%d)+" "+((double)a/b));
        
    }
}