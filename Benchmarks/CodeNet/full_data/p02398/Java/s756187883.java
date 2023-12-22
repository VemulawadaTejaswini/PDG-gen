import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt() , c = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= c; i++) {
            if(a <= i && i <= b) {
                if(c % i == 0) {
                count++ ;
                }
            }
        }
        System.out.println(count);
    }
}