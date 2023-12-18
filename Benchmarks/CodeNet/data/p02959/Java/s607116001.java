import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int [n+1];
		int b[]=new int [n];

		for(int i=0;i<n+1;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}

		int s=0;
		int count=0;

		if(a[n]>=b[n-1]){
			s=0;
			count+=b[n-1];
		}else{
			s=b[n-1]-a[n];
			count+=a[n];
		}

		for(int i=n-1;i>=1;i--){
			if(s>=a[i]){
				s=b[i-1];
				count+=a[i];
			}else if(s+b[i-1]>=a[i]){
				s=b[i-1]+s-a[i];
				count+=a[i];
			}else{
				count+=b[i-1]+s;
				s=0;
			}
		}
		if(s>=a[0]){
			count+=a[0];
		}else{
			count+=s;
		}

		System.out.println(count);



	}
}
