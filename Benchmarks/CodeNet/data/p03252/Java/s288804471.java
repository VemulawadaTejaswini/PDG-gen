import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        Map<String,Boolean> map = new HashMap<>();
        for(int i = 0;i < T.length();i++){
            char t = T.charAt(i);
            char s = S.charAt(i);

            String one = String.valueOf(t) + String.valueOf(s);
            String two = String.valueOf(s) + String.valueOf(t);
            if(map.containsKey(String.valueOf(one)) || map.containsKey(String.valueOf(two))){
                println("No");
                return;
            }

            map.put(one,true);
            map.put(two,true);
            if(S.charAt(i) != T.charAt(i)){
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