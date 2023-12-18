

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] qLine = scanner.nextLine().toCharArray();
		char[] aLine = scanner.nextLine().toCharArray();
		
		for(int i = 0;i<qLine.length;i++) {
			if(qLine[i] != aLine[i]) {
				char q = qLine[i];
				char a = aLine[i];
				qLine[i]= a; 
				for(int j = i + 1;j<qLine.length;j++) {
					if(qLine[j] == q) {
						qLine[j] = a; 
					}else if(qLine[j] == a) {
						qLine[j] = q;
					}
				}
			}
		}
		if(Arrays.equals(qLine, aLine)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
    }
}