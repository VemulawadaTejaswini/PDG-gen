import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		while(true) {

			int n=sc.nextInt();
			if(n==0) break;

			int s[]=new int [n];

			int sum=0;

			for(int i=0;i<n;i++) {
				s[i]=sc.nextInt();
				sum+=s[i];
			}

			double m=sum/(double)n;

			System.out.printf("%.8f\n",Math.sqrt(Dispersion(s,m)));

		}

	}

	private static double Dispersion(int s[],double m) {
		double x=0;
		for(int i=0;i<s.length;i++)
			x+=(s[i]-m)*(s[i]-m);
		return x/s.length;
	}


}

