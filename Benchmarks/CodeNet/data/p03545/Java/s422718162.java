/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{    
    static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        int[] pm = new int[3];
        for (int i = 0; i < 8; i++) {
            int tmp = nums[0];
            String binary = make_bi_nari(3, i);
            for (int j = 0; j < 3; j++) {
                pm[j] = Integer.parseInt(String.valueOf(binary.charAt(j)));
                if (pm[j] == 0) {
                    tmp-=nums[j+1];
                }else{
                    tmp+=nums[j+1];
                }
            }
            if (tmp == 7) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(nums[j]);
                    if (pm[j] == 0) {
                        System.out.print("-");
                    }else{
                        System.out.print("+");
                    }
                }
                System.out.println(nums[3]+"=7");
                return;
            }
        }

        sc.close();
    }

    public static String make_bi_nari(int nbit, int num_to_binary) {
        String res = Integer.toBinaryString(num_to_binary);
        while(res.length() < nbit){
            res = "0" + res;
        }
        return res;
    }

}


