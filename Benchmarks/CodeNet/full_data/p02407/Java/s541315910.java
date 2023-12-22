import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void aa(){
		int n=sc.nextInt();
		int[] N=new int[n];
		for(int i=n;i>0;i--)N[i-1]=sc.nextInt();
		for(int i=0;i<n;i++)if(i!=n-1)System.out.print(N[i]+" ");
		System.out.println(N[n-1]);
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}