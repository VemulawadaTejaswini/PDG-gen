

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
            String[] tem = bufferedReader.readLine().split(" ");
            int[] nums = new int[tem.length];
            for(int i=0;i<4;i++){
                    nums[i]=Integer.parseInt(tem[i]);
            }
            if(nums[3]<=(nums[0]+nums[1])){
                System.out.println(nums[0]);
            }else {
                int sum=nums[0];
                for(int i=nums[3]-nums[0]-nums[1];i>0;i--){
                    sum--;
                }
                System.out.println(sum);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
