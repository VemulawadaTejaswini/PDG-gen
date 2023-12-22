import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x = N%1000;
        int ans = 0;
        if(x!=0) ans = 1000-x;
        System.out.print(ans);
    }
}
