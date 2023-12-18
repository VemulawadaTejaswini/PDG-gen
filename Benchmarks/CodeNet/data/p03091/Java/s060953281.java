import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[] num = new int[N];
		for(int i = 0;i < M;i++) {
			int a = scn.nextInt()-1;
			int b = scn.nextInt()-1;
			num[a]++;
			num[b]++;
		}
		int odd = 0;
		int even = 0;
		boolean can = true;
		for(int i = 0;i < N;i++) {
			if(num[i]==0)can&=false;
			if(num[i]%2==1)odd++;
			if(num[i]%2 == 0) {
				if(num[i]==4) {
					even++;
				}else if(num[i] > 4) {
					even +=2;
				}
			}
		}
		can &= odd==0;
		can &= even >= 2;
			System.out.println(can?"Yes":"No");
	}

}
