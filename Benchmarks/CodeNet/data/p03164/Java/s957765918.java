import java.io.BufferedReader;
import java.io.FileReader;
import java.security.spec.ECPublicKeySpec;
import java.io.File;
import java.util.*;



public class Main{
    static int count = 0;
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws Exception{

        //IO
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().trim().split("\\s");

        int nums = Integer.parseInt(temp[0]);
        int caps = Integer.parseInt(temp[1]);

        int[] weight = new int[nums];
        int[] values = new int[nums];

        for(int i = 0; i < nums; i++){
            temp = in.nextLine().trim().split("\\s");
            weight[i] = Integer.parseInt(temp[0]);
            values[i] = Integer.parseInt(temp[1]);
        }

        //-----------------
        //memorization table

        // long startTime = System.currentTimeMillis();

        Integer[][] memo = new Integer[caps+1][weight.length+1]; 

        System.out.println(brutF_v2_Memo(caps, weight, values, 0, memo));
    }

    public static int brutF_v2_Memo(int caps, int[] w, int[] v, int index, Integer[][] memo){
        
        if(memo[caps][index] == null){
            count2++;            
            if(index == w.length){
                memo[caps][index] = 0;
            }
            else{

                int maxv = brutF_v2_Memo(caps, w, v, index+1, memo);

                if(caps >= w[index]){
                    maxv = Math.max(maxv, v[index] + brutF_v2_Memo(caps - w[index], w, v, index+1,memo));
                }
                memo[caps][index] = maxv;
            }
        }
        return memo[caps][index];

    }
}