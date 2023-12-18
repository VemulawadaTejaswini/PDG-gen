import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        for(int i = 0;i < T.length();i++){
            if(S.charAt(i) != T.charAt(i)){
                char t = T.charAt(i);
                char s = S.charAt(i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0;j < T.length();j++){
                    if(S.charAt(j) == t) {
                        sb.append(s);
                    } else if(S.charAt(j) == s) {
                        sb.append(t);
                    } else{
                        sb.append(S.charAt(j));
                    }
                }
                S = sb.toString();
            }
            if(S.equals(T)){
                println("Yes");
                return;
            }
        }
        println("No");
        return;
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {
        return Integer.parseInt(val);
    }

    static void println(String val){System.out.println(val);};
    static void println(int val){System.out.println(val);};
    static void println(long val){System.out.println(val);};
    static void println(Object val){System.out.println(val);};
}