import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		String ss = in.next();
		int nam = s.length();

		char[] s_c = s.toCharArray();
		char[] ss_c = ss.toCharArray();

        Arrays.sort(s_c);
        Arrays.sort(ss_c);
        
        for(int i = 0 ;i < nam ;i++){
            if(s_c[i]!=ss_c[i]){
                System.out.print("No");
                System.exit(0);
            }
            
        }
        System.out.print("Yes");
	}
}