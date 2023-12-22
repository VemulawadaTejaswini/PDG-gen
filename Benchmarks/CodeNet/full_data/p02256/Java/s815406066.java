import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
    static int gcd(int a, int b){
        int tmp;
        while((tmp = a%b)!=0){
            a = b;
            b = tmp;
        }
        return b;
    }
}
