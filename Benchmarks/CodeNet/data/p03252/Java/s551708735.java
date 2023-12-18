

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String qLine = scanner.nextLine();
		String aLine = scanner.nextLine();
		
		int[] map = new int['z' - 'a' + 1];
		int[] remap = new int['z' - 'a' + 1];
		
		for(int i = 0;i<26;i++) {
			map[i]= -1;
			remap[i]= -1; 
		}
		
		for(int i = 0;i<qLine.length();i++) {
			if(map[qLine.charAt(i) - 'a'] < 0) {
				map[qLine.charAt(i) - 'a'] = aLine.charAt(i) - 'a';
			}else {
				if(map[qLine.charAt(i) - 'a'] != aLine.charAt(i) - 'a') {
					System.out.println("No");
					return;
				}
			}
			if(remap[aLine.charAt(i) - 'a'] < 0) {
				remap[aLine.charAt(i) - 'a'] = qLine.charAt(i) - 'a';
			}else {
				if(remap[aLine.charAt(i) - 'a'] != qLine.charAt(i) - 'a') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
    }
}
    
