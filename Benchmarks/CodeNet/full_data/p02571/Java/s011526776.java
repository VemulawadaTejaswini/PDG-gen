import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        int min = t.length(); 
        for (int i = 0; i <= s.length() - t.length(); i++) {
            int cur = 0; 
            for (int j = 0; j < t.length(); j++) {
                    if (chS[i + j] != chT[j]) {
                        cur++;
                    } 
            }
            min = Math.min(min, cur);
        }
        System.out.println(min);
	}
}