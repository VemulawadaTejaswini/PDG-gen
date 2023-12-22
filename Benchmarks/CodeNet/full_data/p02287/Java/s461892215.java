import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

       for(int i = 0; i <  nums.length; i++){
           String result = "node " + (i+1) + ": "
                   + "key = " +  nums[i] + ", ";
           StringBuilder stringBuilder = new StringBuilder(result);
           if(i != 0){
               stringBuilder.append("parent key = "
                       +  nums[(i-1)/2] + ", ");
           }

           if(2 * i + 1 < nums.length){
               stringBuilder.append("left key = " +  nums[2 * i + 1]
                       + ", ");
           }

           if(2 * i + 2 < nums.length){
               stringBuilder.append("right key = " +  nums[2*i+2] + ", ");
           }
           System.out.println(stringBuilder.toString());
       }
    }
}
