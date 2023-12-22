import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int a[];
		long sum,max;
		
		while(true){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			max=-100000000;
			a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++){
				sum=0;
				for(int j=i;j<n;j++){
					sum+=a[j];
					if(max<sum){
						max=sum;
					}
				}
			}
			System.out.println(max);
		}
	}

}