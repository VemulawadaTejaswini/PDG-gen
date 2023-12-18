import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        int count = 0;
        int current = sc.nextInt();
        for(int i = 1; i < n; i++) {
        	int next = sc.nextInt();
        	if(current >= next) {
        		count++;
        		ans = Math.max(ans, count);
        	} else {
        		count = 0;
        	}
        	current = next;
        }
        System.out.println(ans);
	}
}