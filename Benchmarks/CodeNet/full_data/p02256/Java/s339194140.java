import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr = br.readLine().split("\\s");
            int[] nums = new int[arr.length];
            
            for(int i=0; i<arr.length; i++){
                nums[i] = Integer.parseInt(arr[i]);
            }
            
            System.out.println(String.valueOf(calc(nums[0], nums[1])));
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    static int calc(int a, int b){
        if(a<b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(b==0){
            return a;
        }
        return calc(b, a%b);
    }
}

