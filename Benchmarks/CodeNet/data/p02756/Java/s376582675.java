import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		String S = "tcp";
		StringBuilder s = new StringBuilder(S);
		s.insert(3,"ss");
		System.out.println(s);
		//tsscp
		*/
		
		String S = sc.next();
		StringBuilder s = new StringBuilder(S);
		int Q = sc.nextInt();
		int count =0;
		while(Q>0) {
			int N = sc.nextInt();
			int i = 0;
			if(N==2) {
				int F = sc.nextInt();
				String c = sc.next();
				if(count % 2 !=0) {
					if(F==1) F=2;
					else if(F==2) F=1;
				}
				if(F==1)i=0;
				if(F==2)i=s.length();
				s.insert(i,c);
				
			}else {
				count ++;
			}
			Q--;
		}
		if(count % 2 !=0) {
			System.out.println(s.reverse().toString());
		}else {
			System.out.println(s);
		}
			
			
			
	}
}
