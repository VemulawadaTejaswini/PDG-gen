import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int max = t.length();
        int ans = 0;

        for(int i = 0; i <= s.length()-t.length(); i++){
            int diff = 0;
            for(int j = 0; j < t.length(); j++){
                if(t.charAt(j) != s.charAt(i+j)){
                    diff++;
                }
            }
            ans = Math.min(max,diff);
        }
        System.out.println(ans);
    } 
}