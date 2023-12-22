import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();

		long b=1;
		for(int i=0;i<a;i++){
			long c=sc.nextLong();
			b*=c;	
		}
		long num=1000000000000000000L;
			
		//	System.out.println(num+"\n"+nn);
		if(b>=num+1)System.out.println(-1);
		else System.out.println(b);
		
	}
}