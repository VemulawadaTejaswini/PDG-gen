import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int tmp=0;
		int[] b=new int[a]; 
		int[] c=new int [a];
		int sum=0;
		// スペース区切りの整数の入力
		for(int i=0;i<a*2;i++){
		if(i%2==0)
		 b[i/2] = sc.nextInt();
		else
		c[i/2]=sc.nextInt();
		}
		//int c = sc.nextInt();
		// 文字列の入力
		    Arrays.sort(b);
		    Arrays.sort(c);
if(a>1){
	for(int i=0;i<a-1;i++){
	   sum+=(b[i+1]-b[i]-1);
	}	
	sum+=(b[0]-1);
	sum+=c[0];
	sum+=2;
}else
sum=b[0]+c[0];
		//String s = sc.next();
		// 出力
		System.out.println(sum);
	}
}