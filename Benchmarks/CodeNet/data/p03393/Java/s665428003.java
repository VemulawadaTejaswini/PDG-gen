
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

            used.add(str[str.length-1]);
            for(i=1;i<str.length;i++){//どこまで逆順になっているか
                if(str[str.length-i-1]-str[str.length-i]<0) break;
                else used.add(str[str.length-i]);
            }
            while(true) {
                str[str.length - i - 1] += 1;
                if(used.contains(str[str.length-i-1])||(!alphabet.contains(str[str.length-i-1]))) break;
            }
            for(int j=0;j<str.length-i;j++) System.out.print(str[j]);
            System.out.println();



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
