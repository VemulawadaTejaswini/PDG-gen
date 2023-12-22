import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int ret = 0;
        for(int i = a; i <= b; i++) {
            ret += (c % i == 0) ? 1 : 0;
        }
        
        System.out.println(ret);
    }
}
