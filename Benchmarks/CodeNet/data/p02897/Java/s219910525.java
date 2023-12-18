
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = Integer.parseInt(sc.nextLine());
        if(in == 1){
            System.out.println(1.0);
        }
        if(in % 2 == 0){
            System.out.println(0.5);
        }else{
            System.out.println(1.0 - 1.0 / (in / 2.0));
        }
    }
}