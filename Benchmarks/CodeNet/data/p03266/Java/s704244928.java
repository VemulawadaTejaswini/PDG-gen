import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();
		int a,b,c;
		long total =0;

		long k2= k/2;
		if (k%2 == 1){
			total = (n/k)*(n/k)*(n/k);
		}
		else {
			if ((n/k2)%2 == 1){
				total = ((n/k2)/2)*((n/k2)/2)*((n/k2)/2) + ((n/k2)/2+1)*((n/k2)/2+1)*((n/k2)/2+1);
			}
			else total =((n/k2)/2)*((n/k2)/2)*((n/k2)/2)*2;
		}


/*
		if (k%2 == 1){
			a=k;
			for(int i=1;a*i<=n;++i){
				for (int j=i;a*j<=n;++j){
					for (int m=j;a*m<=n;++m){
						if (i==j && j==m)++total;
						else {
							if (i==j || j==m || i==m) total = total +3;
							else total = total +6;

						}
					}
				}
			}
		}

		else {
			a=k/2;
			for(int i=1;a*i<=n;++i){
				for (int j=i;a*j<=n;j=j+2){
					for (int m=j;a*m<=n;m=m+2){

						if (i==j && j==m)++total;
						else {
							if (i==j || j==m || i==m) total = total +3;
							else total = total +6;
						}
					}
				}
			}
		}
*/
		System.out.println(total);


	}

}