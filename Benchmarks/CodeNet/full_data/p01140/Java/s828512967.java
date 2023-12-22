import java.util.Scanner;

//Square Route
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0)break;
			int[] h = new int[n];
			for(int i=0;i<n;i++)h[i]=sc.nextInt();
			int[] w = new int[m];
			for(int i=0;i<m;i++)w[i]=sc.nextInt();
			int[] wh = new int[1500001];
			int[] ww = new int[1500001];
			for(int i=0;i<n;i++){
				int s = 0;
				for(int j=i;j<n;j++){
					s+=h[j];
					wh[s]++;
//					System.out.println("WH i:" + i + " j:" + j);
				}
			}
//			for(int i=1;i<=20;i++)System.out.println("H: Wid:" + i + " NUM: " + wh[i]);
			for(int i=0;i<m;i++){
				int s = 0;
				for(int j=i;j<m;j++){
					s+=w[j];
					ww[s]++;
//					System.out.println("WW i:" + i + " j:" + j);
				}
			}
//			for(int i=1;i<=20;i++)System.out.println("W: Wid:" + i + " NUM: " + ww[i]);
			int c = 0;
			for(int i=0;i<1500001;i++)c+=wh[i]*ww[i];
			System.out.println(c);
		}
	}
}