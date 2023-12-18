import java.util.Scanner;

public class Main {
	private static int pgcd(int m, int n, int l) {
		int pgcd =0;
		int reste = 0;
		 while(n!=0)
	        {
	            reste=m%n;
	            m=n;
	            n=reste;
	        }
		 while(l !=0) {
			 reste = m%l;
			 m=l;
			 l=reste;
		 }
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int somme = 0;
		for(int i = 1; i <= n ;i ++) {
			for(int j = 1 ; j <= n;j++) {
				for(int k=1; k<= n;k++) {
					somme+= pgcd(i,j,k);
				}
			}
		}
		System.out.println(somme);
	}

}
