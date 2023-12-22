// AOJ 1626
import java.util.Scanner;
 
public class Main{
	
	static int isable(int i, int n, int cnt) {
		if(i == n) return cnt;
		if(i > n) return -1;
		return isable(i + 1, n - i, cnt + 1);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n == 0) break;
        	for(int i = 1; i <= n; i++) {
        		int ans = isable(i, n, 1);
        		if(ans != -1) {
        			System.out.println(i + " " + ans);
        			break;
        		}
        	}
        }
    }
}
