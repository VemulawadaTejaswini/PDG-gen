import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n,m;
		int[] s;
		double a;
		
		while(true){
			n = scan.nextInt();
			a=0;
			if(n==0){
				break;
			}
			m = 0;
			s = new int[n];
			for(int i=0;i<n;i++){
				s[i] = scan.nextInt();
				m += s[i];
			}
			m /= n;
			
			for(int i=0;i<n;i++){
				a += (s[i]-m)*(s[i]-m);
			}
			a /= n;
			a = Math.sqrt(a);
			
			System.out.println(a);
		}
	}
}