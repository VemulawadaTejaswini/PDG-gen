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
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		//int counter=0;
		int sum=0;
		
		for(int i=1;i<N-1;i++){
			if(a[i-1]==a[i]){
				if(a[i]!=1 && a[i+1]!=1){
					a[i]=1;
					sum++;
				}else if(a[i]!=2 && a[i+1]!=2){
					a[i]=2;
					sum++;
				}else{
					a[i]=3;
					sum++;
				}
			}
		}
		if(a[N-2]==a[N-1]){
			sum++;
		}
		//for(int i=0;i<N;i++){
			//System.out.println("a["+i+"]:"+a[i]+",");
		//}
		System.out.println(sum);
		
	}
}