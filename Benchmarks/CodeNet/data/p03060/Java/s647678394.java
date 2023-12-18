import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] Values = new int[N];
		int[] Costs = new int[N];
		int max=0;

		for(int i=0;i<N;i++) {
			Values[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			Costs[i]=sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			int dif=Values[i]-Costs[i];
			if(max<dif) {
				max=dif;
			}
			for(int j=i+1;j<N;j++) {
				int dif2=Values[j]-Costs[j];
				dif2+=dif;
				if(max<dif2) {
					max=dif2;
				}
			}
		}
		System.out.println(max);
	}
}