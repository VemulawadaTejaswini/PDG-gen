import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = sc.next();
			char[] s_l = s.toCharArray();
            for(int i=0;i<s.length();i++){
                s_l[i] = (char)((s_l[i] - 'A' + n)%26+65);
            }
            System.out.println(s_l);
	}
}
