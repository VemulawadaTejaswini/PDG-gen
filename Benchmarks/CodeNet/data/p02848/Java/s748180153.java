import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String str[] = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
        	str[i] = s.substring(i, i + 1);
        }
        Arrays.sort(str);
        String ans = "";
        for(int i = n; i < s.length(); i++){
        	ans += str[i];
        }
        for(int i = 0; i < n; i++){
        	ans += str[i];
        }
        System.out.println(ans);
    }
}