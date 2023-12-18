import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String k = "keyence";
        String str = in.next();
        String new_word = "";
        int j = 0;
        for(int i = 0; i < k.length(); i++){
            for (j = j; j < str.length(); j++){
                //System.out.println(j);
                if (k.charAt(i) == str.charAt(j)){
                    new_word += k.charAt(i);
                    break;
                }
            }
        }
        //System.out.println(j);
        System.out.println(k.equals(new_word)? "YES": "NO");
    }
    
}
