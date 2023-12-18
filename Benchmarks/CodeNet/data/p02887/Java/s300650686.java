
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String in = sc.nextLine();
        int result = 0;
        char prev = 0;
        for(char c : in.toCharArray()){
            if(prev != c){
                result++;
            }
            prev = c;
        }
        System.out.println(result);
    }
}