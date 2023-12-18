import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int aa = (b - a);
        int bb = (c - b);
        if(aa == bb) System.out.println("YES");
        else System.out.println("NO");
    }
}
