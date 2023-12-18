
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        char[] moji = "abcdefghijklmnopqrstuvwxyz".toCharArray();


        if(s.equals("zyxwvutsrqponmlkjihgfedcba")){
            System.out.println(-1);
            return;
        }
        HashSet<Character> alphabet = new HashSet<>();

        for(int i=0;i<str.length;i++){
            alphabet.add(str[i]);
        }

        if(str.length>=26){
            int i;
            HashSet<Character> used = new HashSet<>();

            for(i=1;i<str.length;i++){//どこまで逆順になっているか
                used.add(str[str.length-i]);
                if(str[str.length-i-1]-str[str.length-i]<0) break;
            }
            
            for(int j=0;j<str.length-i-1;j++) System.out.print(str[j]);

            for(i=0;i<26;i++){
                if(moji[i]>str[str.length-i-1]&&used.contains(moji[i])) {
                    System.out.println(moji[i]);
                    return;
                }

            }



        }else{
            for(int i=0;i<26;i++){
                if(!alphabet.contains(moji[i])){
                    s+=moji[i];
                    break;
                }
            }
            System.out.println(s);
        }

    }
}
