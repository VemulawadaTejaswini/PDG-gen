import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder sb = new StringBuilder();
        boolean matched = true;
        for (int i = s.length() - t.length(); i >= 0; i--) {
            matched = true;
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i + j) != '?' && s.charAt(i + j) != t.charAt(j)){
                    matched = false;
                    break;
                }
            }
            if(matched){
                if(i != 0) sb.append(s.substring(0, i));
                sb.append(t);
                if(i != s.length() - t.length()) sb.append(s.substring(i + t.length()));
                break;
            }
        }

        if(matched) System.out.println(sb.toString().replace('?', 'a'));
        else System.out.println("UNRESTORABLE");
        sc.close();
    }

}
