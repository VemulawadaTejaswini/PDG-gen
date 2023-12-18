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
        int leftIntex = -1;
        int rightIndex = -1;
        for(int i = 0; i < NUM - 1; i++){
            if(nums[i] > nums[i + 1]){
                if(count == 1){
                    rightIndex = i;
                } else {
                    leftIntex = i;
                }
                count++;
            }
        }

        // answer
        if(count == 0){
            System.out.println("YES");
        } else if (count == 1 || count == 2){
            String answer = "NO";
            for(int i = leftIntex + 1; i < NUM; i++){
                if(NUM == 2){
                    answer = "YES";
                } else if(nums[leftIntex+1] > nums[i] && nums[i - 1] < nums[leftIntex]){
                    answer = "YES";
                    break;
                }
            }
            System.out.println(answer);
        } else if (count >= 3){
            System.out.println("NO");
        }


    }
}