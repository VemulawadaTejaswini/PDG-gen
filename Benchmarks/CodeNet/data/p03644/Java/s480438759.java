import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0,a, count,ans=1;
		for(int i = 1;i <= n;i++) {
			count = 0;
			if(i % 2 == 1)continue;
			a = i;
			for(;;) {
				if(a / 2 != 0) {
					a = a/2;
					count++;
				}
				else {
					count++;
					break;
				}
			}
			if(max < count) {
				max = count;
				ans = i;
			}
		}
		System.out.println(ans);
	}

}
