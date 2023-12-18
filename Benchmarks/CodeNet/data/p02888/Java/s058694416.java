
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] in = sc.nextLine().split(" ");
        List<Integer> ints = new ArrayList<Integer>();
        for(String str : in){
            ints.add(Integer.parseInt(str));
        }
        Collections.sort(ints);
        long r = 0;
        for(int ia = 0;ia < n;ia++){
            for(int ib = ia + 1;ib < n;ib++) {
                for (int ic = ib + 1; ic < n; ic++) {
                    int a = ints.get(ia);
                    int b = ints.get(ib);
                    int c = ints.get(ic);
                    if(a < b + c){
                        if(b < c + a){
                            if(c < a + b){
                                r++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(r);
    }
}