import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String sN = "";
        String tN = "";
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
        int sC = 0;
        int tC = 0;
        if(sN.equals(tN)){
            while (s.length()>0){
                s = s.replaceAll(String.valueOf(s.charAt(0)), "");
                sC++;
            }
            while (t.length()>0){
                t = t.replaceAll(String.valueOf(t.charAt(0)), "");
                tC++;
            }
        }

        if(sC == tC && sC != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}