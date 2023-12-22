import java.util.*;
public class Main{
	public static int[] S;
	public static boolean bi(int num,int x,int y){
		int z=(x+y)/2;
		if(num==S[z]){
			return true;
		}
		if(z==x||z==y){
			return false;
		}
		else if(num>S[z]){
			return bi(num,z,y);
		}
		else{
			return bi(num,x,z);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		S=new int[n];
		for(int i=0;i<n;i++){
			S[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		int T,ans=0;
		for(int i=0;i<q;i++){
			T=sc.nextInt();
			if(bi(T,0,n)==true){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
