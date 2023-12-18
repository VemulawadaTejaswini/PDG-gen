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
        b = a*0.1;
        b = Math.floor(b);
        int k = (int)a;
        int j = (int)b;
        //System.out.println(j);
        //System.out.println(taxEight);
        if(taxTen == j) {
            System.out.println(k);
        }else {
            System.out.println("-1");
        }
    }
}