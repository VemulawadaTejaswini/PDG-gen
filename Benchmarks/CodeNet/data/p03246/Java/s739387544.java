package Jugs.AtCoder;

import java.util.HashMap;
import java.util.Map;

public class VVVSequence {

    public static void main(String[] args) {
//        int n = 4;
        int[] seq = {1,1,1,1}; //{105, 119, 105, 119, 105, 119}; {3,1,3,2};

//        int res_1 = solution_1(seq.length, seq);
//        System.out.println(res_1);
        int res_2 = solution_2(seq.length, seq);
        System.out.println(res_2);
    }

    private static int solution_2(int length, int[] seq) {
        int overflow = 0;
        int p1 = seq[0];
        int p2 = seq[1];

        for (int i = 2; i< seq.length; i++){
            if (p1 == p2){
                overflow++;
            }
            else if (i %2 == 0){
                if (seq[i] != p1)
                    overflow++;
                p1 = seq[i];
            }
            else if (i%2 != 0){
                if (seq[i] != p2)
                    overflow++;
            }
        }
        return overflow;
    }

    private static int solution_1(int n, int[] seq) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        int overflow = 0;
        for (int i=0; i< seq.length; i++){
            if (bucket.containsKey(seq[i])){
                int val = bucket.get(seq[i]);
                bucket.put(seq[i], val+1);
            }
            else
                bucket.put(seq[i], 1);
        }
        int counter = 0;
        for (Map.Entry map : bucket.entrySet()){
            int val = (int) map.getValue();
            if (val > 2)
                overflow++;
            if (val == 1){
                counter++;
                if (counter == 2){
                    overflow++;
                    counter = 0;
                }
            }
        }
        return overflow;
    }
}
