import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] nums = new int[NUM];
        for(int i = 0; i < NUM; i++){
            nums[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 1; i < NUM - 1; i++){
            if((nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) || (nums[i - 1] > nums[i] && nums[i] > nums[i + 1])){
                count++;
            }
        }

        // answer
        System.out.println(count);
    }
}