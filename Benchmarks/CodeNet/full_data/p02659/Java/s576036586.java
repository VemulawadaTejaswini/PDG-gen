import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();

        double res = A * B;
        String val = String.valueOf(res);
        int index = val.indexOf(".");
        val = val.substring(0, index);

        System.out.println(val);

    }
}
