import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		long d;
		int i,n,sum=0;
		while(sc.hasNext()){
			a=sc.nextDouble();
			b=sc.nextDouble();
			n=sc.nextInt();
			c=a/b;
			if(c>1){
				int f=(int) c;
				c=c-f;
			}
			c=c*1000000000;
			d=(long)c;
			String str=Long.toString(d);
			char ch[]=str.toCharArray();
			int e[]=new int[ch.length];
			for(i=0;i<e.length;i++){
				e[i]=ch[i]-'0';
			}
			for(i=0;i<n;i++){
				sum+=e[i];
			}
			System.out.println(sum);
			sum=0;
		}//while
	}
}