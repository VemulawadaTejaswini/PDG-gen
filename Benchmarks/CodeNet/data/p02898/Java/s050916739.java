
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        int n = Integer.parseInt(ins[0]);
        int k = Integer.parseInt(ins[1]);
        String[] humans = sc.nextLine().split(" ");
        int r = 0;
        for(int i = 0;i < n;i++){
            if(Integer.parseInt(humans[i]) >= k){
                r++;
            }
        }
        System.out.println(r);
    }
}