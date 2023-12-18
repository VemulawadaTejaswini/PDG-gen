import java.util.*;
public class main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			if(a!=1){
				int b = in.nextInt();
				if(b!=1)
					s = s + in.next();
				else
					s = in.next() + s;
			}
			else{
				String q = "";
				for(int j = 0;j < s.length();j++){
					q = s.charAt(j) + q;
				}
				s = q;
			}
		}
		System.out.println(s);
	}
}
