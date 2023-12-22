import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] N=new int[n];
		int h,i,max=-10000000,min=10000000,sum=0;
		for(i=0;i<n;i++){
			h=sc.nextInt();
			N[i]=h;
			sum=sum+N[i];
			if(N[i]<min)
				min=N[i];
			if(N[i]>max)
				max=N[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}
