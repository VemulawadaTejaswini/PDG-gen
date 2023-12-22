import java.util.Scanner;

public class Main {

public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	int[] ten;
	int i,n;
	double ave=0,sum=0,bunsan;
	
	for(;;){
		n = sc.nextInt();
		if (n==0) break; 
		ten = new int[n];

		for(i=0;i<n;i++){
			ten[i] = sc.nextInt();
		}

		for(i=0;i<n;i++){
			ave+= ten[i]/(n+0.0);
		}

		System.out.println(ave);

		for(i=0;i<n;i++){
			sum+= (ten[i]-ave)*(ten[i]-ave);
		}
		bunsan=Math.sqrt(sum/n);

		System.out.println(bunsan);

		ave=0;
		sum=0;
	}
}
}