import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int cos;
        if (Math.abs(h*30 - m*6) > 180) {
            cos = 360 - Math.abs(h*30 - m*6);
        } else {
            cos = Math.abs(h*30 - m*6);
        }
        double c2 = Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(cos));
        double c = Math.sqrt(c2);

        System.out.println(c);
        
    }
}