import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 ArrayList<Long> lst = new ArrayList<>();
		 long a=input.nextInt();
		 long b=input.nextInt();
		 long c=input.nextInt();
		 long d=input.nextInt();
		 long Amx=Math.max(a, b);
		 long Amin=Math.min(a,b);
		 long Bmx=Math.max(c, d);
		 long Bmin=Math.min(c,d);
		 
		
		for(long i=Amin;i<=Amx;i++) {
			for(long j=Bmin;j<=Bmx;j++) {
				long res=i*j;
				lst.add(res);
				
			}
				
		}
		Long max = Collections.max(lst);
		System.out.println(max);
		

		
	}

}
