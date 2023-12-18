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
        int remainder = 0;
        int pow_of_ten = 1;
        for(int i = 0;i < target_string.length(); i++){
            // 019と19が同じ扱いになってしまうので。。。
            remainder = (remainder + (target_string.charAt(i)-'0')*pow_of_ten)%2019;
            pow_of_ten = (pow_of_ten*10)%2019;
            remainder_mapping.put(remainder,remainder_mapping.get(remainder)+1);
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