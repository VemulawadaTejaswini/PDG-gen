import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		int[] s;
		int sum;
		double m;
		double a2;
		double a;

		while(true){
			n = sc.nextInt();
			s = new int[n];
			if(n == 0)
				break;
			sum = 0;
			m = 0;
			a = 0;
			a2 = 0;
			for(int i=0; i<n; i++){
				s[i] = sc.nextInt();
				sum += s[i];
			}
			m = (double)sum/n;
			for(int i=0; i<n; i++){
				a2 += Math.pow((s[i]-m),2.0);
			}
			a2 = a2/n;
			a = Math.sqrt(a2);
			System.out.printf("%.8f\n",a);

		}
	}
}