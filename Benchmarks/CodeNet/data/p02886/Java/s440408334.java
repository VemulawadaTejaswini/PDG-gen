
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] ds = sc.nextLine().split(" ");
        List<Integer> ints = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            ints.add(Integer.parseInt(ds[i]));
        }
        long result = 0;
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(i != j) {
                    result += ints.get(i) * ints.get(j);
                }
            }
        }
        System.out.println(result);
    }
}