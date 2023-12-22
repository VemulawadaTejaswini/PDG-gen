import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextInt();
            double b = sc.nextInt();
            int c = sc.nextInt();
            double d = Math.ceil(a/b);
            System.out.println((int)d * c);
        }
    }
