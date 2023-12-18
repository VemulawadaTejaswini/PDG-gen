import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int[] charCnt = new int[26];
      	
      	for (char c: s.toCharArray()) {
        	if (charCnt[c - 'a'] != 0) {
            	System.out.println("no");
              	System.exit(0);
            }
          	charCnt[c - 'a']++;
        }
      	System.out.println("yes");
    }
}
