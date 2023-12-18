import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int[] dupArr = new int[s.length()+1];
		
		char beforeChar = s.charAt(0);
		int length = 1;
		for(int i = 1; i < s.length(); i++) {
			char nowChar = s.charAt(i);
			if(nowChar == beforeChar) {
				length++;
			}else {
				beforeChar = nowChar;
				dupArr[length] += 1;
				length = 1;
			}
		}
		dupArr[length] += 1;
		
		if(dupArr[s.length()] > 0) {
			
			System.out.println((long)s.length() * (long)k / 2L);
			
		}else {
			
			long replaceAtSingle = 0;
			for(int i = 2; i < s.length();i++) {
				replaceAtSingle += (i/2) * dupArr[i]; 
			}
			
			if(s.charAt(0) == s.charAt(s.length() - 1)) {
				
				int startDup = 0;
				int endDup = 0;
				
				char startEndChar = s.charAt(0);
				while(s.charAt(startDup) == startEndChar) {
					startDup++;
				}
				while(s.charAt(s.length() - endDup -1) == startEndChar) {
					endDup++;
				}
				
				long replaceAtDup =replaceAtSingle;
				replaceAtDup -= startDup/2;
				replaceAtDup -= endDup/2;
				replaceAtDup += (startDup + endDup)/2;
				
				System.out.println(replaceAtSingle + replaceAtDup *(k-1));
				
			}else {
				System.out.println(replaceAtSingle*k);
			}
			
		}
		
	}

}
