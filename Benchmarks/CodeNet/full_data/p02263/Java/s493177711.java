import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] str_split = str.split(" ",0);

        int[] nums = new int[str_split.length];
        int top = 0;

        for(int i = 0;i < str_split.length;i++){
            switch(str_split[i].charAt(0)){
                case '+':
                    top--;
                    nums[top - 1] = nums[top - 1] + nums[top];
                    break;
                case '-':
                    top--;
                    nums[top - 1] = nums[top - 1] - nums[top];
                    break;
                case '*':
                    top--;
                    nums[top - 1] = nums[top - 1] * nums[top];
                    break;
                default:
                    nums[top] = Integer.parseInt(str_split[i]);
                    top++;
                    break;
            }
        }
        System.out.println(nums[0]);
    }
}
