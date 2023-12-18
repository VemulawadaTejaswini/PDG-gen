import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String W = keyboard.next();	
		
		int[] count = new int[W.length()];
		
		if(W.length() % 2 == 0) {
			for(int i =0; i < W.length(); i++) {
				for(int j=0; j < W.length(); j++) {
					if(W.charAt(i) != W.charAt(j)) {
						count[i]++;
					}
				}
			}
		
			int NG = 0;
			String kotae;
		
			for(int k=0; k < W.length(); k++) {
				if(count[k] % 2 == 1) {
					NG++;
				}
			}
			kotae = NG == 0 ? "Yes" : "No";
			System.out.print(kotae);
		
		}else {
			System.out.print("No");
		}
		
		keyboard.close();	
	}
}