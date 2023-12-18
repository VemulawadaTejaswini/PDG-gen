import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();

        double left = Math.sqrt(a) + Math.sqrt(b);
//        System.out.println(left);
        double right = Math.sqrt(c);
//        System.out.println(right);

        if (left < right){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
