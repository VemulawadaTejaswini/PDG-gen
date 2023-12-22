import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++){
			String cmd = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(cmd.equals("print")){
				System.out.println(str.substring(a, b+1));
				continue;
			}

			if(cmd.equals("reverse")){
				String s1 = "";
				if(a >= 1) s1 = str.substring(0, a);
				String s2 = new StringBuilder(str.substring(a, b+1)).reverse().toString();
				String s3 = "";
				if(b <= str.length() - 2) s3 = str.substring(b+1, str.length());
				str = s1 + s2 + s3;
				continue;
			}

			if(cmd.equals("replace")){
				String p = sc.next();
				str = new StringBuilder(str).replace(a, b+1, p).toString();
				continue;
			}
		}
	}
}
