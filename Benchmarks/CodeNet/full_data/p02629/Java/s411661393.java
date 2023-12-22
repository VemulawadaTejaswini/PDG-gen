import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
			long n = sc.nextLong();
			//
			StringBuilder a=new StringBuilder("");
			long count=0;
			//long p=n%27;
			if(n>26) {
				long q=0;
				while(n>26) {
					q=n%26;
					n/=26;
					if(q!=0) {
						a.append((char)('a'+q-1));
					}else {
						a.append((char)('a'+(q-1+26)%26));
						
					}
				}
				if(q==0) {
					n-=1;
				}
				a.append((char)('a'+n-1));
				
			}else {
				a.append((char)('a'+n-1));
			}

			System.out.println(a.reverse());
		
		
	}
}
