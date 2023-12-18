import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
import java.math.*;
import java.util.HashMap;

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
		//double countx=0;
		int n=sc.nextInt();
		

		
		int[] v = new int[n];
		int[] odd =new int[n/2];
		int[] even=new int[n/2];
		int[] dis=new int[n/2];
		int[] emode =new int[100001];
		int[] omode =new int[100001];
		for(int i=0;i<n/2;i++){//0 origin
			even[i]=sc.nextInt();
			odd[i]=sc.nextInt();
			emode[even[i]]++;
			omode[odd[i]]++;
		}
		if(n==2){
			if(even[0]==odd[0]){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			System.exit(0);
		}
	
		int epo=0;
		int epo2=0;
		int etmp=0;
		int etmp2=0;
		for(int i=0;i<100001;i++){
			if(emode[i]>etmp){
				epo2=epo;
				etmp2=etmp;
				epo=i;
				etmp=emode[i];
			}else if(emode[i]>etmp2){
				epo2=i;
				etmp2=emode[i];
			}
		}
		int opo=0;
		int opo2=0;
		int otmp=0;
		int otmp2=0;
		for(int i=0;i<100001;i++){
			if(omode[i]>otmp){
				opo2=opo;
				otmp2=otmp;
				opo=i;
				otmp=omode[i];
			}else if(omode[i]>otmp2){
				opo2=i;
				otmp2=omode[i];
			}
		}
		if(opo!=epo){
			System.out.println(n-(otmp+etmp));
		}else{
			int s=Math.max(otmp+etmp2, otmp2+etmp);
			System.out.println(n-s);
		}
		
		
		
	}
		
}