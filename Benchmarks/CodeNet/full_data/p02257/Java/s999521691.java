import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int loop = Integer.parseInt(br.readLine());

            int[] nums = new int[loop];
            for(int i=0; i<loop; i++){
                nums[i] = Integer.parseInt(br.readLine());
            }
            
            int count = 0;
            for(int i=0; i<loop; i++){
                if(isPrime(nums[i])){
                    // System.out.println(String.valueOf(arr[i]));
                    count++;
                }
            }
            System.out.println(String.valueOf(count));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    static boolean isPrime(int x){
        if((x%2==0&&x!=2) || (x%3==0&&x!=3) || (x%5==0&&x!=5) || (x%7==0&&x!=7)){
            return false;
        }
        for(int i=2; i<(int)Math.sqrt(x)+1; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}

