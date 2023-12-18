import java.util.Scanner;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		
		int N=sc.nextInt();
		int min=1000000001;
		int max=0;
		int avesum=0;
		//int B=sc.nextInt();
		int[] a=new int[N];
		
		for(int i=0;i<N;i++){
			int k=sc.nextInt();
			a[i]=k-i;
			if(a[i]<min){
				min=a[i];
			}else if(a[i]>max){
				max=a[i];
			}
			avesum+=a[i];
		}
		
		int ave1=avesum/N;
		
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i=0;i<N;i++){
			sum1+=Math.abs(a[i]-(ave1-1));
			sum2+=Math.abs(a[i]-(ave1));
			sum3+=Math.abs(a[i]-(ave1+1));
		}
		int ans=Math.min(sum1,Math.min(sum2, sum3));
		//int difmin=1000000001;
		
		// 5 3 1 -1 -3 -5
		//0 -1 -2 -3 -3 -3 -3
		/*
		int pastsum=1000000001;
		for(int b=min;b<=max;b++){
			int sum=0;
			for(int i=0;i<N;i++){
				sum+=Math.abs(a[i]-b);
			}
			if(pastsum<sum){
				break;
			}else{
				pastsum=sum;
			}		
		}
		System.out.println(pastsum);
		*/
		System.out.println(ans);
	}
}