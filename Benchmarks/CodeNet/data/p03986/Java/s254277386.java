import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;
		long a = 0, b = 0, c = 0;
		char ch;
		String str = "";
		
        String s1 = sc.next();
//　      int s = Integer.parseInt(sc.next());
//	    int[] test  = new int[100000];
//      char[] c1 = s1.toCharArray();
        str = s1;
        while(str.contains("ST")){
            str = str.replaceAll("ST", "");
        }

        System.out.print(str.length());
        System.out.println();
	}
}