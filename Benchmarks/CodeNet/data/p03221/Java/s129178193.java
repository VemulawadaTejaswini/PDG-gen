import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n,m,i,j;
		n=scan.nextInt();
		m=scan.nextInt();
		long si[] = new long[m];
		long ans[]= new long[m];
		long ta=1000000;
		for(i=0;i<m;i++){
			long p,y;
			p=scan.nextInt();
			y=scan.nextInt();
			si[i]=p*ta*ta+y*ta+i;
		}
		Arrays.sort(si);
		long mae=0,ren=0;
		for(i=0;i<m;i++){
			if(si[i]/(ta*ta)!=mae){mae=si[i]/(ta*ta);ren=0;}
			ren++;
			ans[(int)(si[i]%ta)]=mae*ta+ren;
		}
		for(i=0;i<m;i++){
			String iti=Long.toString(ans[i]);
			for(j=iti.length();j<12;j++){System.out.print(0);}
			System.out.println(iti);
		}
	}
}