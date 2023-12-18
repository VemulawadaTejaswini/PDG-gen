import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        String ans = "Three";
        for(int i=0; i<n; i++) {
            s[i] = sc.next();
            if(s[i].equals("Y")) {
                ans = "Four";
                break;
            }
        }
        System.out.println(ans);
        
    }
}
