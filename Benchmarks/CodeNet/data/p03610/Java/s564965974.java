import java.util.*;


class Main {
    private static Scanner sc;


    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String ans = "";
        final char[] S = sc.next().toCharArray(); 
        for (int i = 0; i < S.length; i+=2) {
                ans += String.valueOf(S[i]); 
        }
        System.out.println(ans);
    }
}



