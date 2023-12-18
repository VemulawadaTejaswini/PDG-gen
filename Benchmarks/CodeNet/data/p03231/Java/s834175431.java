import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		String t=sc.next();
		boolean yes=true;

		int a=Math.min(n, m);
		int b=Math.max(n,m);
		int c;

		while (a!=0){
			c=b%a;
			b=a;
			a=c;
		}

		for(int i=0;i<b;++i){
			if(s.charAt(s.length()/b*i)==t.charAt(t.length()/b*i));
			else {yes=false; break;}
		}

		if (yes==true)System.out.println(n*m/b);
		else System.out.println(-1);


	}
}
