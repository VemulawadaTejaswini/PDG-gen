import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int d;
        int r;
        double f;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        d = a/b;
        r = a%b;
        f = (double)a/b;
        System.out.printf("%d %d %6f",d,r,f);
    }
}