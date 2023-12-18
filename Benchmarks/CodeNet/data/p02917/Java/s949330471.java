import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n - 1];
		long ans = 0;
		int pre = 0;
		int aft = 0;
		for (int i = 0; i < n - 1; ++i)
		b[i] = sc.nextInt();
		sc.close();
		for(int i = 0; i < n - 1; ++i){
			int tmp = b[i];
			if(i != n - 2)aft = b[i + 1];
			if(i == 0){
				tmp <<= 1;
			}else if (i != n - 2){
				if(pre < tmp && tmp > aft)
				tmp = Math.max(pre, aft);
			}
			ans += tmp;
			pre = tmp;
		}
		System.out.println(ans);
	}
}
