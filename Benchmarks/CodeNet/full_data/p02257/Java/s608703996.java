import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int[] num = new int[n];
		for(int i = 0; i < n; i ++){
			num[i] = sc.nextInt();
		}
		System.out.println(judge(num));
	}
	static int judge(int[] num){
		final int max = 1000000 + 1;
		int cnt = 0;
		boolean isp = false;
		for(int i = 0; i < num.length; i++){
			isp = true;
			if(num[i] == (2|3|5|7)) {
				cnt++; continue;
			}
			for(int j = 2; j < num[i]/2; j++){
				if(num[i] % j == 0) {
					isp = false; break;
				}
			}
			if(isp) cnt++;
		}
		return cnt-1;
	}
}