import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);



		int n=sc.nextInt();
		int m=sc.nextInt();
		long num[]= new long[m];
		long p[]=new long[m];
		long y[]=new long[m];


		for(int i=0;i<m;++i){
			p[i]=sc.nextLong()+1000000;
			y[i]=sc.nextLong();
			num[i]=1000001;
			for(int j=0;j<i;++j){
				if(y[i]<y[j] && p[i]==p[j])++num[j];
				else if(y[i]>y[j] && p[i]==p[j])++num[i];
			}
		}

		for( int i=0;i<m;++i){
			String s=String.valueOf(p[i]);
			String s2=String.valueOf(num[i]);
			System.out.println(s.substring(1)+s2.substring(1));
		}
	}
}