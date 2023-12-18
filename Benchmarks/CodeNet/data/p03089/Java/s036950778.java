import java.util.*;
 
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
 
		int n=sc.nextInt();
 
		int b[]=new int[n];
		boolean bnum[]= new boolean [n];
		Arrays.fill(bnum, false);
		int b0[]=new int[n];
		
		for(int i=0;i<n;++i) {
			b[i]=sc.nextInt();
			b0[i]=b[i];
		}
		Arrays.sort(b);
		
		boolean boo=true;
		for(int i=0;i<n;++i) {
			if (b[i]>i+1) {
				boo=false;
				break;
			}
		}
		if (boo==false)System.out.println(-1);
		else {
			
			for( int i=n-1;i>=0;--i) {
				for( int j=0;j<n;++j) {
					if(b0[j]<=n-i)System.out.println(b0[j]);
				}
			}
			
		}
	}
	
}