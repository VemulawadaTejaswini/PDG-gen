import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
        	int h = sc.nextInt();
        	if(max <= h) {
        		ans++;
        		max = h;
        	}
        }
        System.out.println(ans);
    }
}