import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int aa = Math.abs(a - b);
        int bb = Math.abs(b - c);
        if(aa == bb) System.out.println("YES");
        else System.out.println("NO");
    }
}