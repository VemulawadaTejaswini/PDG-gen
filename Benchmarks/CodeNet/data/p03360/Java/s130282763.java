import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        if (a < b) {
            if (b < c){
                System.out.println(a+b+c*2*k);
            } else {
                System.out.println(a+b*2*k+c);
            }
        } else {
            if (a < c){
                System.out.println(a+b+c*2*k);
            } else {
                System.out.println(a*2*k+b+c);
            }

        }
    }
}
