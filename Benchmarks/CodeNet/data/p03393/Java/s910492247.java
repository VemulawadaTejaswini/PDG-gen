import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();
        if(S.equals("zyxwvutsrqponmlkjihgfedcba"))
            System.out.println(-1);
        else {
            int[] c = new int[26];
            for(int i = 0; i < S.length(); i++){
                c[S.charAt(i) - 'a']++;
            }
            if(S.length() != 26){
                char C = 'a';
                for(int i = 0; i < 26; i++){
                    if(c[i] == 0){
                        C = (char)('a' + i);
                        break;
                    }
                }
                System.out.print(S);
                System.out.println(C);
            } else {
                int idx  = 25;
                while(S.charAt(idx) < S.charAt(idx-1)){
                    idx--;
                }
                for(int i = 0; i < idx-1; i++){
                    System.out.print(S.charAt(i));
                }
                System.out.println(S.charAt(25));
            }
        }
    }
}