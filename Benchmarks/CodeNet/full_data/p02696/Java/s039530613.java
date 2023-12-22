import java.util.Scanner;

class Main{
	static public void main(String[] args){
		//xは1からnまで
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		long value=0;
		long v2;
		for(long x=1;x<=n;x++){
			v2=value;
			value=(x*a/b)-(a*(x/b));
			if(v2<value)v2=value;
		}
		System.out.println(value);
	}
}