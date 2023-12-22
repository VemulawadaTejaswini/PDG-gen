import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void aa(){
		int n=sc.nextInt();
		int[] N=new int[n];
		for(int i=n;i>0;i--)N[i]=sc.nextInt();
		for(int i=0;i<n;i++)System.out.println(N[i]);
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}