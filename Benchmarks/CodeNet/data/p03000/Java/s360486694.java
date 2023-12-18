import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x = sc.nextInt();
		int[] l = new int[n+1];
		for(int i = 1;i <= n;i++) {
			l[i] = sc.nextInt();
		}
		
		int value = 0,cnt = 0,d = 0;
		for(int i = 1;i <= n;i ++) {
			if(value > x) break;
			value = d + l[i];
			d = value;
			cnt++;
		}
		System.out.println(cnt);
	}
	
}