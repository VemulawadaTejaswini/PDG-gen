import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
		
		
       for(char c : s) {
           // System.out.print((char)((c-'A'+n)%26 + 'A'));
          System.out.print((char)((c-'A'+n)%26 + 'A'));

        }


      
	}
}