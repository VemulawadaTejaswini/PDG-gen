import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int[] num = new int[n];
		for(int i = 0; i < n; i ++){
			num[i] = sc.nextInt();
			if(judge(num[i])) cnt++;
		}
		System.out.println(cnt);
	}
	static boolean judge(int n){
		if(n == 2) return true;
		for(int i = 2; i < n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}