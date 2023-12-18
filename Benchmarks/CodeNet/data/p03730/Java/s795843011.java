
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if(a%2 == 0 && c % 2 == 1) {
            System.out.println("NO");
        } else if(a%2 == 1 && c % 2 == 0) {
            System.out.println("YES");
        } else if(a%2 == 1 && c % 2 == 1) {
            System.out.println("YES");
        } else if(a%2 == 0 && c % 2 == 0){
            System.out.println("NO");
        }
    }
}
