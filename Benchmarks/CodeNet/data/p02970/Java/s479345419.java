import java.lang.Math;
 
public class Main {
    public static void main(String[] args) {
        int N = 30;
        int D = 4;
        double temp = (double) N / ((2 * D) + 1);
        System.out.println(temp);
        double ans = Math.ceil(temp);
        System.out.println(temp);
        System.out.println((int) (ans));
    }
}