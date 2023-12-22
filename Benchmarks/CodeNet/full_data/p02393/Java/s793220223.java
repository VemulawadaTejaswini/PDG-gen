import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        while(!(a<=b) || !(b<=c)){
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
        }
        System.out.printf("%d %d %d", a, b, c);
        scan.close();
    }
}
