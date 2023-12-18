import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[10000000];
		boolean jud = true;
		int i = 1;
		int tmp = n;
		a[tmp] ++;
		int ans = 1;
		while(jud) {
			if(tmp%2 == 0) {
				tmp /= 2;
			}else {
				tmp = 3 * tmp + 1;
			}
			i++;
			
			if(a[tmp] == 1) {
				ans = i;
				jud = false;
			}else {
				a[tmp] ++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
