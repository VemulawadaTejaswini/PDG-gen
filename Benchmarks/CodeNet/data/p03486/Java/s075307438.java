import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Arrays.sort(s);
        char[] t = sc.next().toCharArray();
        Arrays.sort(t);
        int smin = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == s[0]) smin++;
            else break;
        }
        int tmax = 0;
        for (int i = t.length-1; i >= 0; i--) {
            if(t[i] == t[t.length -1]) tmax++;
            else break;
        }
        if(s[0] < t[t.length -1]
                || (s[0] == t[t.length -1] && tmax < smin)
                || (s[0] == t[t.length -1] && s.length == smin && smin <= tmax)){
            System.out.println("Yes");
        }else System.out.println("No");
        sc.close();

    }

}