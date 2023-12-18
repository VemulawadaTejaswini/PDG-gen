import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taxEight = in.nextInt();
        int taxTen = in.nextInt();
        double a = 0;
        double b = 0;
        a = taxEight/0.08;
        a = Math.floor(a);
        b = taxTen/0.1;
        b = Math.floor(b);
        int k = (int)a;
        int j = (int)b;

        if(k == j) {
            System.out.println(j);
        }else {
            System.out.println("-1");
        }
    }
}