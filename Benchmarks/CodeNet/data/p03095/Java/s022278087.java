import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> Cs = new ArrayList<>(N);
        ArrayList<ArrayList<Integer>> Cis = new ArrayList<>(N);
        Integer intObj;
        ArrayList<Integer> nums = new ArrayList<>(N);
        int seq = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            intObj = Integer.valueOf(scn.nextInt());
            Cs.add(intObj);
        }
        for(int i=0; i<N; i++) {
            // System.out.println("for go");
            nums.clear();
            for(int l=0; l<N; l++) {
                intObj = Integer.valueOf(Cs.get(l));
                if (intObj == Integer.valueOf(i)) {
                    nums.add(l);
                }
            }
            // System.out.println(nums);
            for(int l=0; l<nums.size()-1; l++) {
                if(nums.size() > 0 && (nums.get(l+1) - nums.get(l)) == 1) {
                    seq++;
                }
            }
            if(nums.size() > 0) {
                // System.out.println("aaa" + nums.size());
                int ster = 0;
                for(int l=0; l<nums.size()-1; l++) {
                    ster = ster + l + 1 - seq;
                    // System.out.println("ster + " + ster);
                    // System.out.println("seq + " + seq);
                }
                // System.out.println("ster + " + ster);
                count = count + ster;
            }
            Cis.add(nums);
            // System.out.println(seq);
            // System.out.println(count);
        }
        System.out.println(count+1);
    }
}