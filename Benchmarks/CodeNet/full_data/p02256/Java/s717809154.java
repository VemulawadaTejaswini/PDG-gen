import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(true) {
            int c = Math.max(a, b);
            int d = Math.min(a, b);
            a = c % d;
            b = d;
            if (a == 0) {
                System.out.println(d);
                break;
            }
        }
    }
}
