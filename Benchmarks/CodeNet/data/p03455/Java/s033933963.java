import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next() + sc.next();
        double num = Double.parseDouble(s);
        double root = Math.sqrt(num);

        System.out.println(num == Math.pow(root, 2) ?  "Yes" : "No");
    }
}
