import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int L = keyboard.nextInt();
		int Q = keyboard.nextInt();
		String N = keyboard.next();
		
		String[]moji = N.split("");
		int[]wa = new int[L+1];
		
		for(int i = 0; i<L-1; i++) {
			if(moji[i].equals("A")) {
				if(moji[i+1].equals("C")) {
					wa[i+2] = 1;
				}
			}
		}
		
		for(int j = 1; j<L+1; j++) {
			wa[j] = wa[j] + wa[j-1];
		}
		
		for(int k = 0; k<Q; k++) {
			int a = keyboard.nextInt();
			int b = keyboard.nextInt();
			if(a != 1 && moji[a-1].equals("C") && moji[a-2].equals("A")) {
				System.out.println(wa[b]- wa[a-1]-1);
			}else{
				System.out.println(wa[b]- wa[a-1]);
			}
		}
		keyboard.close();	
	}
}
