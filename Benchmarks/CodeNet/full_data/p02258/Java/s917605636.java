import java.util.*;
class Main{
	void aaaa(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int y;
		int min=2000000000;
		int x=-2000000000;
		for(int i=0;i<N;i++){
			y=sc.nextInt();
			if(y-min>x)x=y-min;
			if(min>y)min=y;
		}
		System.out.println(x);
	}
	public static void main(String[]arg){
		Main dn=new Main();
		dn.aaaa();
	}
}