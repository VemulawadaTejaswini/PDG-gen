
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0;
        char prev = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(prev!=s.charAt(i))ans++;
            prev = s.charAt(i);
        }
        System.out.println(ans);


    }
}
