import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        String[] nums = str.split("\\s");

        int a = (Integer.parseInt(nums[2]) - Integer.parseInt(nums[0]));
        int b = (Integer.parseInt(nums[3]) - Integer.parseInt(nums[1]));

        double ans = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
        
        System.out.println(ans);
        
        br.close();
        
    }

}

