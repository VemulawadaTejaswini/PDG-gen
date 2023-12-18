import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();

        int ab = a * b;
        int bc = b * c;
        int ca = c * a;
        int min1 = Math.min(ab, bc);
        int min2 = Math.min(min1, ca);
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            if(min2 == ab){
                int n = c / 2;
                System.out.println(ab * (n + 1) - ab * n);
            }else if (min2 == bc){
                int n = a / 2;
                System.out.println(bc * (n + 1) - bc * n);
            }else if (min2 == ca){
                int n = b / 2;
                System.out.println(ca * (n + 1) - ca * n);
            }
        } else {
            System.out.println("0");
        }
    }
}