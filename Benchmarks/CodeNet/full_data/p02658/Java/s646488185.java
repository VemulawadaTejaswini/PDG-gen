import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long b=1L;
		for(int i=0;i<n;i++){
			long a=sc.nextLong();
			b*=a;
		}
		long max=10;
		for(int i=0;i<18;i++)
			max*=10;
		
		if(b>max)System.out.print(-1);
		else System.out.print(b);
	}
}