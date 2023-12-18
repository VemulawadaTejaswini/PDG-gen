import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String sN = "";
        String tN = "";
        boolean can = false;
        for(int i = 0; i<s.length(); ){
            for(int j = i + 1; j<=s.length(); j++){
                if(j == s.length() || s.charAt(i) != s.charAt(j)) {
                    sN += j - i;
                    i = j;
                    break;
                }
            }
        }
        for(int i = 0; i<s.length(); ){
            for(int j = i + 1; j<=t.length(); j++){
                if(j == t.length() || t.charAt(i) != t.charAt(j)) {
                    tN += j - i;
                    i = j;
                    break;
                }
            }
        }
        if(sN.equals(tN)){
            can = true;
            for(int i = 0;i < t.length(); i++) {
                if (!s.contains(String.valueOf(t.charAt(i)))) {
                    can = false;
                    break;
                }
            }
        }

        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}