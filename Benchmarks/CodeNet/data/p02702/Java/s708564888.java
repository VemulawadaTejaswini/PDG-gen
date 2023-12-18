import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> remainder_mapping = new HashMap<>();
        for(int i = 0;i < 2019;i++){
            remainder_mapping.put(i,0);
        }
        Scanner sc = new Scanner(System.in);
        String target_string = sc.next();

        for(int i = 0;i < target_string.length(); i++){
            //TODO: 019 19とが同じになってしまう
            if(!target_string.substring(i,target_string.length()).substring(0,1).equals("0")){
                BigInteger target = new BigInteger(target_string.substring(i,target_string.length()));
                remainder_mapping.put(target.remainder(BigInteger.valueOf(2019)).intValue(),remainder_mapping.get((target.remainder(BigInteger.valueOf(2019))).intValue())+1);
            }
        }
        int answer = 0;
        for(int i = 0;i < 2019;i++){
            int candidates = remainder_mapping.get(i);
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