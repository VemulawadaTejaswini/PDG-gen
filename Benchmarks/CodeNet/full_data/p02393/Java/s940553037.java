import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        do {
        if (a>b){
            int d = b;
            b = a;
            a = d;
        }
        if (b>c){
            int d = c;
            c = b;
            b = d;
        }
        }while(a<=b && b<=c);
        System.out.printf("%d %d %d", a, b, c);
        scan.close();
    }
}
