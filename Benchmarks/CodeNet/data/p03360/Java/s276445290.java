import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        if (a <= b) {
            if (b <= c){
                System.out.println("答え１は"+(Math.pow(2,k)*c+a+b));
            } else {
                System.out.println("答え２は"+(Math.pow(2,k)*b+a+c));
            }
        } else {
            if (a <= c){
                System.out.println("答え３は"+(Math.pow(2,k)*c+a+b));
            } else {
                System.out.println("答え４は"+(Math.pow(2,k)*a+b+c));
            }

        }
    }
}