import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (((a>b)&(b>c))||((b>a)&(a>c))||((c>a)&(a>b))||((c>b)&(b>a))) System.out.println("No");
        else System.out.println("Yes");

    }
}
