import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int a[]=new int[n];
		for(int i=0;i<n;i++)		a[i]=sc.nextInt();

		int min=a[0];
		for(int i=0;i<n;i++){
			if(a[i]<min)	min=a[i];
		}

		int max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max)	max=a[i];
		}

		int sum=0;
		for(int i=0;i<n;i++)	sum=sum+a[i];

		System.out.println(min+" "+max+" "+sum);
	}
}