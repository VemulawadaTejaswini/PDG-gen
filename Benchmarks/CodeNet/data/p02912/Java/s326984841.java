import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);


        Integer[] nums = new Integer[N];
        String[] inputs = bf.readLine().split(" ");
        for(int i=0; i<inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(nums, Collections.reverseOrder());

        while(M>0) {
            nums[0] = nums[0] / 2;
            M--;
            Arrays.sort(nums, Collections.reverseOrder());
        }

        long answer = 0;
        for(int i=0; i<nums.length; i++) {
            answer += nums[i];
        }
        System.out.println(answer);
    }

}