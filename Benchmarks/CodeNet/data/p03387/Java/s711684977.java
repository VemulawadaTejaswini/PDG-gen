import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0;i<3;i++)num[i]=sc.nextInt();
		Arrays.sort(num);
		sc.close();
		int cnt = 0;
		for(;num[1]<num[2];) {
			num[0]++;num[1]++;
			cnt++;
		}
		for(;num[0]<num[2];) {
			num[0]+=2;
			cnt++;
		}
		for(;num[0]>num[1];) {
			num[1]++;num[2]++;
			cnt++;
		}
		System.out.println(cnt);
	}
}