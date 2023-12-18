import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int figure = S.length()-2;
        char start = S.charAt(0);
        char end = S.charAt(S.length()-1);
        String s = S.valueOf(start);
        String e = S.valueOf(end);
        String f = S.valueOf(figure);
        
        System.out.println(s + f + e);
    }
}