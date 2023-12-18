import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int a,b,c;
		int total =0;


		if (k%2 == 1){
			total = n/k + (n/k)*(n/k -1)*3 + (n/k)*(n/k-1)*(n/k-2);
		}
		else {
			if ((n/(k/2))%2 == 1){
				total = n/(k/2) +(n/(k/2)/2)*(n/(k/2)/2)*6 + (n/(k/2)/2)*(n/(k/2)/2-1)*(n/(k/2)/2*2-1);
			}
			else total =  n/(k/2) +(n/(k/2)/2)*(n/(k/2)/2-1)*6 + (n/(k/2)/2)*(n/(k/2)/2-1)*(n/(k/2)/2-2);
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