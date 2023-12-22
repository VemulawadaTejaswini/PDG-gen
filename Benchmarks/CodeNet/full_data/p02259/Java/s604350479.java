import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            nums.add(sc.nextInt());
        }

        boolean flag = true;
        int inversion = 0;
        int index = 0;
        while(flag) {
            flag = false;
            for(int i=n-1; i>index;--i) {
                if(nums.get(i-1) > nums.get(i)) {
                    int tmp = nums.get(i);
                    nums.set(i, nums.get(i-1));
                    nums.set(i-1, tmp);
                    inversion++;
                    flag = true;
                }
            }
            index++;
        }

        for(int i=0; i<n-1; ++i) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println(nums.get(n-1));
        System.out.println(inversion);
    }
}