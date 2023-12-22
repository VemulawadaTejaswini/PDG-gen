import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d=a/b;
        int e=a%b;
        double d1=a,d2=b;
        double f=d1/d2;
        System.out.println(d+" "+e+" "+f);
    }
}