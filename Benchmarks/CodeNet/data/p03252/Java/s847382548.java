import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");
        boolean b = true;
        ArrayList<String> S = new ArrayList<>();
        ArrayList<String> T = new ArrayList<>();
        for (int i=0;i<s.length&&b;i++){
            if (!S.contains(s[i])){
                S.add(s[i]);
            }
            s[i] = Integer.toString(S.indexOf(s[i]));
            if (!T.contains(t[i])){
                T.add(t[i]);
            }
            t[i] = Integer.toString(T.indexOf(t[i]));
            if (!s[i].equals(t[i]))b=false;
        }

        if (b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
