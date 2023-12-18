import java.util.*;
public class Main{
	static int result=0;
	static int N;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 N= sc.nextInt();
		int M=sc.nextInt();
		int[] a=new int[M];
		int[] b=new int[M];
		for(int i=0;i<M;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
		}
		sub2(a,b,(int)Math.pow(2, N)-2,0);
		System.out.println(result);				

	}
	public static void sub2(int[]a,int[]b,int pass,int pos){
		if(pass==0){
			result++;
			return;
		}
		for(int i=0;i<N;i++){
			if((pass/(int)Math.pow(2,i))%2==1){
				if(sub1(a,b,pos,i)){
					sub2(a,b,pass-(int)Math.pow(2,i),i);
				}
				
			}
		}
		return;
	}
	public static boolean sub1(int[] a,int[] b,int n,int m){
		for(int i=0;i<a.length;i++){
				if(a[i]==n&&b[i]==m){
					return true;
				}
				if(a[i]==m&&b[i]==n){
					return true;
				}
		}
		return false;
	}
}