import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        
        int maxMatch = 0;
        int slen = s.length();
        int tlen = t.length();
        for(int i=0; i+tlen <= slen; i++) {
            String ssub = s.substring(i, i+tlen);
            int match = 0;
            for(int j=0; j<tlen; j++) {
                if(t.charAt(j) == ssub.charAt(j)) {
                    match++;
                }
            }
            maxMatch = Math.max(maxMatch, match);
        }
        System.out.println(tlen - maxMatch);
    }
}
