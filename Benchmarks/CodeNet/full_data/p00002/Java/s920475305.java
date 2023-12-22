import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a)throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 		int nums[] = new int[2];
        
        for(int i=0;i<2;i++){
        	nums[i] = Integer.parseInt(in.readLine());
        }

    	String str = String.valueOf(nums[0]+nums[1]);
    	System.out.println(str.length());
    }
}