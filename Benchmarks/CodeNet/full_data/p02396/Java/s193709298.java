import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do {
        	System.out.printf("Case %d: %d\n", i, n);
        	i ++;
        	n = sc.nextInt();
        }while(n == 0);
    }
}
