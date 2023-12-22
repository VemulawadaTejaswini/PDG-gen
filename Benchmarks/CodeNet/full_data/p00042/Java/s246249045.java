import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0042().doIt();
	}

	class aoj0042 {	
		void DP(int W,int TE[],int TW[],int n,int sum[]){
			for(int i = 0;i < n;i++){
				for(int j = W;j > 0;j--){
					if(sum[j] > 0)sum[j+TW[i]] = Math.max(sum[j+TW[i]], sum[j] + TE[i]);
				}
				sum[TW[i]] = Math.max(sum[TW[i]], TE[i]);
			}
		}
		void doIt() {
			int cnt = 1;
			while (true) {
				int W = sc.nextInt();
				if (W == 0)break;
				int n = sc.nextInt();
				int sum[] = new int [2*W];
				int TE[] = new int [n];
				int TW[] = new int [n];
				for (int i = 0; i < n; i++) {
					String[] node = sc.next().split(",");
					TE[i] = Integer.valueOf(node[0]);
					TW[i] = Integer.valueOf(node[1]);
				}
				System.out.println("Case "+cnt+":");
				DP(W,TE,TW,n,sum);
				int Eans = 0;
				int Wans = 0;
				for(int i = 0;i <= W;i++){
					if(Eans < sum[i]){
						Eans = sum[i];
						Wans = i;
					}
				}
				System.out.println(Eans);
				System.out.println(Wans);
				cnt++;
			}
		}
	}
}