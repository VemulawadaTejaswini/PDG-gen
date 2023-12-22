import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
 
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                if (a * b < n) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
 
        in.close();
    }
}