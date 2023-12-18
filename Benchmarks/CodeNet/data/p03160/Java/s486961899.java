import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int array[] = new int[num1];
        int dp[] = new int[num1];
        Arrays.fill(dp, 10000); 
        
        for(int i=0; i<num1; i++){
            int num2 = scan.nextInt();
            array[i] = num2;
        }
        
        dp[0] = 0;
        dp[1] = Math.abs(array[1] - array[0]);
        
        for(int i=2; i<num1; i++){
            if(dp[i] > dp[i-1] + Math.abs(array[i] - array[i-1])){
                dp[i] = dp[i-1] + Math.abs(array[i] - array[i-1]);
            }

            if(dp[i] > dp[i-2] + Math.abs(array[i] - array[i-2])){
                dp[i] = dp[i-2] + Math.abs(array[i] - array[i-2]);
            }
        }
        
        for(int i=0; i<num1; i++){
            System.out.println(dp[i]);
        }



        


    }
}