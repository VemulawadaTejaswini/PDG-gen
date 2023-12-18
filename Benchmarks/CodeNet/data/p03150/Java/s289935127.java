import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        boolean flg = false;
        boolean flg2 = false;
        int index = 0;
        char[] keyence = "keyence".toCharArray();
        for (int i = 0; i < S.length(); i++) {
        	if (S.charAt(i) == keyence[index]) {
        		index++;
        		if (flg) {
        			flg2 = true;
        		}
        	} else {
        		flg = true;
        		if (flg2) {
        			System.out.println("NO");
        		}
        	}
        }
        
        System.out.println(index == keyence.length ? "YES" : "NO");
    }
}