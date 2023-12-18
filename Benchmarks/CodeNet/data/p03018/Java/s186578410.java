import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("BC", "D");
        int cnt = 0;
        int aCnt = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'A')
        		aCnt++;
        	else if(s.charAt(i) == 'D')
        		cnt += aCnt;
        	else
        		aCnt = 0;
        }
        System.out.println(cnt);
    }
}
