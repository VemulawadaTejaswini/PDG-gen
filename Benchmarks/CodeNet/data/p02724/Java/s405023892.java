import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 500;
        int b = (x - a*500)/5;
        System.out.print(1000*a+5*b);
    }
}