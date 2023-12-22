import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		while(true){
			if(S.equals("-")) break;
			int m = sc.nextInt();
			String ans = S;
			
			for(int i = 0; i < m; i++){
				int h = sc.nextInt();
				String right = ans.substring(h);
				String left = ans.substring(0, h);
				ans = right + left;
			}
			
			S = sc.next();
			System.out.print(ans);
			if(!S.equals("-")) System.out.println();
		}
	}
}
