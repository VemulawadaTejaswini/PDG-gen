import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a string
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c > a) {
            a = 0;
            c -=a;
            b = b > a ? b - a : 0;
        } else {
            a =- c;
        }
        // output
        System.out.printf("%d %d%n",a, b);
    }
}