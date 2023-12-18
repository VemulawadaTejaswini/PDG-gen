import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        List<Character> stone = new ArrayList<>(S.length());
        for(int i=0; i<S.length(); i++) {
            stone.add(S.charAt(i));
        }

        //end : wwwwwbbbb
        long ans = 0;
        int w=0, b=0;
        for(int i=0; i<stone.size(); i++){
            char last = stone.get(i);
            if(last=='B') b++;
            else{
                //wwwwwbbbbW -> wwwwwbbbwb -> ... -> wwwwwwbbbb
                ans += b;
                w++;
            }
        }
        System.out.println(ans);
    }
}