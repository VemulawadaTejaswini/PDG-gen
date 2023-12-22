import static java.lang.Math.*;
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
	static boolean judge(int a){
		if(a == (2|3|5|7)) return true;
		if(a % 2 == 0) return false;
		for(int i = 3; i <= sqrt(a); i++){
			if(a % i == 0) return false;
		}
		return true;
	}
}