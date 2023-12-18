
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] city = new int[N+1];
		for (int i = 0; i < N+1; i++) {
			city[i] = sc.nextInt();
		}
		int res =0;
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if(city[i]>=input) {
				city[i] -= input;
				res+=input;
			}else {
				res+=city[i]+city[i+1]-Math.max(city[i+1]-input+city[i],0);
				city[i] = 0;
				if(city[i+1]-input+city[i]>0) {
					city[i+1] -= city[i+1]-input+city[i];
				}else {
					city[i+1]=0;
				}
			}
		}
		System.out.println(res);
	}
}