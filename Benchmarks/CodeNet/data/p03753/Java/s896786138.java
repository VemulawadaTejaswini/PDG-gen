import java.util.Scanner;

public class Main{
	
	static Scanner	s	=new Scanner(System.in);
	static long n;
	static int m, q, a[];
	
	public static void main(String[] __){
		input();
		
		int b=a[a.length-1]-a[0], k=2;
		if(b<7){
			System.out.println(1);
			return;
		}else{
			if(a[0]==0)
				k--;
			if(a[a.length-1]==m-1)
				k--;
			
			System.out.println(7L*n/m*k);
		}
	}
	
	private static final void input(){
		n=s.nextLong();
		m=s.nextInt();
		q=s.nextInt();
		a=new int[q];
		for(int i=0; i<q; i++)
			a[i]=s.nextInt();
	}
}
