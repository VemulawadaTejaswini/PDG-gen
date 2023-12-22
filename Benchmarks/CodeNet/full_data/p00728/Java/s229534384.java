import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(1>0){
			int n=sc.nextInt();
			if(n==0)break;
			int[] d;
			d=new int[n];
			for(int i=0;i<n;i++)d[i]=sc.nextInt();
			Arrays.sort(d);
			int sum=0;
			for(int i=1;i<n-1;i++)sum+=d[i];
			sum/=(n-2);
			System.out.printf("%d\n",sum);
		}
	}
}