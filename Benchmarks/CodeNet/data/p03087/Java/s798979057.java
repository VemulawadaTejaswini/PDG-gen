import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		s.nextInt();
		int q = s.nextInt();
		String inS = s.next();
		char[] chars = inS.toCharArray();
		char[] target = "AC".toCharArray();
		
		int start;
		int end;
		int count;
		int i,j;
		
		for(i=0; i<q ;i++) {
			start = s.nextInt();
			end = s.nextInt();
			count = 0;
			for(j = start -1 ; j < end - 1 ; j ++) {
				if(chars[j] == target[0] && chars[j+1] == target[1]) {
					count++;
					j++;
				}
			}
			System.out.println(count);
			
		}
		
	}

}