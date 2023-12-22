import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String str = sc.next();
        double db = Double.parseDouble(str);
        double ans = a*db;
        long ansInt = (long)ans;

        System.out.println(ansInt);
    }
}
