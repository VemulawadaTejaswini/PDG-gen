import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 	
		int N = sc.nextInt();

		int a[] = new int[N];
		long sum[] = new long[N];
		
		a[0] = sc.nextInt();
		sum[0] = a[0];

		for(int i=1;i<N;i++){
			a[i] = sc.nextInt();
			sum[i] = sum[i-1] + a[i];
		}

		int rcut1 = 0;
		int rcut3 = 2;
		long rdiff = Long.MAX_VALUE;

		for(int cut2=1;cut2 < N-2;cut2++){

			long dev1diff = Long.MAX_VALUE;

			for(int cut1 = rcut1;cut1 < cut2;cut1++){

				long diff = Math.abs(sum[cut1] - (sum[cut2] - sum[cut1]));

				if(dev1diff >= diff) {
					dev1diff = diff;
					rcut1 = cut1;
				} else {
					break;
				}
			}
			

			long dev2diff = Long.MAX_VALUE;
			
			for(int cut3 = cut2 + 1;cut3 < N-1;cut3++){

				long diff = Math.abs((sum[cut3] - sum[cut2]) - (sum[N-1] - sum[cut3]));

				if(dev2diff >= diff){
					dev2diff = diff;
					rcut3 = cut3;
				}else{
					break;
				}
			}
			long a1 = sum[rcut1];
			long a2 = sum[cut2] - sum[rcut1];
			long a3 = sum[rcut3] - sum[cut2];
			long a4 = sum[N-1] - sum[rcut3];

			long max = Math.max(Math.max(a1,a2),Math.max(a3,a4));
			long min = Math.min(Math.min(a1,a2),Math.min(a3,a4));
			rdiff = rdiff < max - min?rdiff:max-min;

		}

		System.out.println(rdiff);
	}
 
}