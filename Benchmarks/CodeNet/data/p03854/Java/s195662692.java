
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		String t = sb.append(s).reverse().toString();
		String []p = {"maerd","remaerd","esare","resare"};
		int []l = {5,7,5,6};
		
		boolean flag = true;
	r:	while(flag) {
			
			for(int i = 0 ;i < 4 ;i++) {
				if(t.length() < l[i]) 
					continue;
				if(t.substring(0, l[i]).equals(p[i])) {
					t = t.replace(p[i], "");
					//System.out.println(t);
					continue r;
				}
			}
			flag = false;
		}
		
		if(t.equals("")){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
