

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int c =0;
		//String []str =new String[number];
		int []v=new int [number];
		
		for(int i = 0;i<number;i++){
			
			v[i]= scan.nextInt();
		}
		int odd[]=Split(v,0);
		int even[]=Split(v,1);
		int max1=Max(Check(odd));
		int max2=Max(Check(even));

		if(max1==0&&max2==0&&even[0]==odd[0]){
			c=2;
		}
		System.out.println(max1+max2+c);
	}
	//偶数番目, 奇数番目を取り出して配列に格納するメソッド
	//違うか判定して配列に格納（この違いの個数の最小が, 最低限入れ替えなければいけない配列の総数）
	//配列の最小値を返すメソッド
	public static int []Split(int []a, int s){
		int split,t;
		boolean bool;

		if(a.length%2==0){
			t=a.length/2;
		}else{
			t =a.length/2+1;
		}
		int[]odd=new int[t];
		int []even=new int[a.length/2];
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				even[i/2]=a[i];
			}else{
				odd[i/2]=a[i];
			}
		}
		if(s==1){
			return even;
		}else{
			return odd;
		}
	}
	public static int Max(int []max){
		int m = max[0];

		for(int i=0;i<max.length;i+=2){
			if(m<max[i]){
				m=max[i];
			}
		}
		return m;
	}
	public static int []Check(int []v){
		int []check =new int[v.length];
		for(int i=0;i<v.length;i++){
			check[i]=0;
			for(int j=0;j<v.length;j++){
				if(v[i]!=v[j]){
					check[i]++;
				}
			}
		}
		return check;
	}


	public static int c(int[]x){
		int a=0;
		for(int i=0;i<x.length;i++){
			if(x[i]!=0){
				a++;
			}
		}
		if(a==0){
			return 2;
		}else{
			return 0;
		}

	}

}

