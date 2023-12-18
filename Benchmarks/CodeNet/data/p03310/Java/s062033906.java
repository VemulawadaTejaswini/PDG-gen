import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		long a[] = new long[N];
		long c[] = new long[N];
		
		a[0] = sc.nextLong();
		c[0] = a[0];

		for(int i=1;i<N;i++){
			a[i] = sc.nextLong();
			c[i] = c[i-1] + a[i];
		}

		int rcut1 = 0;
		int rcut3 = 2;
		long rdiff = Long.MAX_VALUE;

		for(int cut2=1;cut2 < N-2;cut2++){

			long dev1diff = Long.MAX_VALUE;

			for(int cut1 = 0;cut1 < cut2;cut1++){

				long diff = Math.abs(c[cut1] - (c[cut2] - c[cut1]));

				if(dev1diff >= diff) {
					dev1diff = diff;
					rcut1 = cut1;
				} else {
					break;
				}
			}
			

			long dev2diff = Long.MAX_VALUE;
			
			for(int cut3 = cut2 + 1;cut3 < N-1;cut3++){

				long diff = Math.abs((c[cut3] - c[cut2]) - (c[N-1] - c[cut3]));

				if(dev2diff >= diff){
					dev2diff = diff;
					rcut3 = cut3;
				}else{
					break;
				}
			}

			long max = Math.max(Math.max(c[rcut1],c[cut2]-c[rcut1]),Math.max(c[rcut3]-c[cut2],c[N-1]-c[rcut3]));
			long min = Math.min(Math.min(c[rcut1],c[cut2]-c[rcut1]),Math.min(c[rcut3]-c[cut2],c[N-1]-c[rcut3]));
			rdiff = rdiff < max - min?rdiff:max-min;

		}

		System.out.println(rdiff);
	}
 
}