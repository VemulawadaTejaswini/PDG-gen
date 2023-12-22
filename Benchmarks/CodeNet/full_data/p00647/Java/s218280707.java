import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int L = 0;
			int Lc = 0;
			int D = 0;
			int Dc = 0;
			int M = 0;
			int Mc = 0;
			
			String s;
			int a, b, c;
			for(int i=0;i<n;i++){
				s = sc.next();
				a = Integer.valueOf(s.substring(0,2));
				b = Integer.valueOf(s.substring(3,5));
				c = sc.nextInt();
				if(11<=a && a<=14){
					L++;
					if(b>c) c+=60;
					if(c-b<=8) Lc++;
				}else if(18<=a && a<=20){
					D++;
					if(b>c) c+=60;
					if(c-b<=8) Dc++;					
				}else if((21<=a && a<=24) || a==0 || a==1){
					M++;
					if(b>c) c+=60;
					if(c-b<=8) Mc++;					
				}		
			}
			System.out.print("lunch ");
			if(L==0) System.out.println("no guest");
			else System.out.println((100*Lc)/L);
			System.out.print("dinner ");
			if(D==0) System.out.println("no guest");
			else System.out.println((100*Dc)/D);
			System.out.print("midnight ");
			if(M==0) System.out.println("no guest");
			else System.out.println((100*Mc)/M);	
		}	
	}	
}