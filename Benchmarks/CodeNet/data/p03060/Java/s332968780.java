import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] Values = new int[N];
		int[] Costs = new int[N];
		int ans=0;

		for(int i=0;i<N;i++) {
			Values[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			Costs[i]=sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			if((Values[i]-Costs[i])>0) {
				ans+=Values[i]-Costs[i];
			}
		}
		System.out.println(ans);
	}
}