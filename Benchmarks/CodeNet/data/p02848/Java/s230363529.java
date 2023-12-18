import java.util.Scanner;
 

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
     
        char[] chars = s.toCharArray();
        StringBuilder bui = new StringBuilder(chars.length);
        for (char c: chars) {
        	c += n;
        	if (c > 'Z') {
        		c = (char)('A' + (c-'Z') -1);
        	}
        	bui.append(c);
        }
        
        System.out.println(bui.toString());
        sc.close();
	}
	
}
