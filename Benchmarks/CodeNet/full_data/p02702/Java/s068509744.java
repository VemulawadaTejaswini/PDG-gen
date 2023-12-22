import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<BigInteger>> remainder_mapping = new HashMap<>();
        for(int i = 0;i < 2019;i++){
            remainder_mapping.put(i, new ArrayList<>());
        }
        Scanner sc = new Scanner(System.in);
        String target_string = sc.next();

        for(int i = 0;i < target_string.length(); i++){
            //TODO:
            BigInteger target = new BigInteger(target_string.substring(i,target_string.length()));
            remainder_mapping.get((target.remainder(BigInteger.valueOf(2019)).intValue())).add(target);
        }
        int answer = 0;
        for(int i = 0;i < 2019;i++){
            int candidates = remainder_mapping.get(i).size();
            if(candidates != 0){
                answer += ((candidates-1)*(candidates))/2;
                if(i == 0){
                    answer += candidates;
                }
            }
        }
        System.out.println(answer);
    }
}