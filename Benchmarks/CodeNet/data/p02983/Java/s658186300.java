import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        //String line = sc.nextLine();
        check(num);
    }

    public static void check(String num) {
        //int cnt = Integer.parseInt(num);
        String[] strs = num.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int min=2019;
        for(int i=nums[0]; i<nums[1]; i++) {
            for(int j=nums[0]+1; j<=nums[1]; j++) {
                if (min > (i * j) % 2019) {
                    min = (i * j) % 2019;
                }
            }
        }
        System.out.println(min);
    }
}