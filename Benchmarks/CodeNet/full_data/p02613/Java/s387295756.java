import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		String[] S = new String[N];

		for(int i=0; i<N; i++) {
			S[i] = keyboard.next();
		}
		
		int ac = 0; 
		int wa = 0; 
		int tle = 0; 
		int re = 0; 
		
		for(int j=0; j<N; j++) {
			if(S[j].equals("AC")) {
				ac++;
			}else if(S[j].equals("WA")) {
				wa++;
			}else if(S[j].equals("TLE")) {
				tle++;
			}else if(S[j].equals("RE")) {
				re++;
			}
		}
				
									
		System.out.print("AC x ");
		System.out.println(ac);
		System.out.print("WA x ");
		System.out.println(wa);
		System.out.print("TLE x ");
		System.out.println(tle);
		System.out.print("RE x ");
		System.out.println(re);
		keyboard.close();	
		
	}
}
