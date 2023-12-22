 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b){
                int x=a; 
                    a=b;
                    b=x;
                 }
        if (b>c) {
                  int x=b;
                   b=c;
                   c=x;
                 }
        if (a>b) {
                 int  x=a;
                   a=b;
                   b=x;
                   }
        System.out.println(a+" "+b+" "+c);
    }
}
