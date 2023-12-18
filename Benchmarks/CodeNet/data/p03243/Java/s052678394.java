import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a/100);
        int c = Integer.parseInt(b + b + b);
        if (a - c > 0) {
            System.out.println(c + 111);
        } else {
            System.out.println(c);
        }
    }
}