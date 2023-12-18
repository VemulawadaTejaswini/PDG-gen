import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp = sc.next();
        StringBuffer sb = new StringBuffer();
        sb.insert(0, tmp);
        int[] tmp2 = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            tmp2[i] = sb.charAt(i);
        }
        String ans;
        if (sb.charAt(0) == sb.charAt(1)) {
            ans = "Bad";
        } else if(sb.charAt(1) == sb.charAt(2)){
            ans = "Bad";
        } else if (sb.charAt(2) == sb.charAt(3)) {
            ans = "Bad";
        } else {
            ans = "Good";
        }
        System.out.println(ans);
        
    }
}