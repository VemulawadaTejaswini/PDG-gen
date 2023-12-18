import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());

        double nx = n / 1.08;
        double ans = Math.round(nx);


        if (ans * 1.08 < n) {
            System.out.println(":(");
        } else {
            System.out.print((int)ans);
        }
    }
}