import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int T=sc.nextInt();
			long a, b, c, d, e=0;
			Set<Long> set=new HashSet<>();
			
			for(int i=0; i<T; i++) {
				a=sc.nextLong();
				b=sc.nextLong();
				c=sc.nextLong();
				d=sc.nextLong();
				boolean tf=false;
				long count=0;
				while(true) {
					if(a<b) {
						tf=false;
						break;
					}
					if(count>0 && set.contains(a)) {
						tf=true;
						break;
					}
					
					set.add(a);
					e=a%b;
					if(e<=c) {
						a=e+d;
					}
					else if(e>c) {
						a=e;
					}
					count++;
				}
				System.out.println(tf? "Yes":"No");
				set.clear();
				
			}
			
			
		}
	}
}