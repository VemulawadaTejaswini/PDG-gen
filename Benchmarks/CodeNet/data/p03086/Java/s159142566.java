import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int max = 0, curLength = 0;
		
		
		for (int i=0; i<s.length(); i++) {
			char k = s.charAt(i);
			
			if (k == 'A' || k == 'T' || k == 'G' || k == 'C') {
				curLength++;
				max = Math.max(curLength, max);
			} else {
				curLength = 0;
			}
		}
		
		System.out.println(max);
		
	}
}
