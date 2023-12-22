import java.util.Scanner;
class Main {
    public static void main( String[] args ) {
Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r ;

        while( (r = a % b) != 0 ) {
            a = b;
            b = r;
        }
        System.out.println(b);
    }
}
