import java.util.Scanner;

public class JavaFloatIntExample2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("");
            int A = sc.nextInt();
            float B = sc.nextFloat();
            sc.close();
            float product = A*B;
            System.out.println((int)product);
        }
}
