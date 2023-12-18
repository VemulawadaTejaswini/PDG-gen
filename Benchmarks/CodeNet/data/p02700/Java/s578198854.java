import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = a/d;
        int s = c/b;
        if(a%d!=0) count++;
        if(c%b!=0) s++;
        if(s>count) System.out.println("No");
        else System.out.println("Yes");
    }
}