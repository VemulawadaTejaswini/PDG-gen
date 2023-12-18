import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int numAll = Integer.parseInt(line1[0]);
    int index = Integer.parseInt(line1[1]);
    String[] data = br.readLine().split(" ");
    
    long[] nums = new long[numAll];
    long[] ans = new long[(numAll*(numAll-1))/2];
    int p = 0;
    for(int i=0; i<numAll; i++){
      nums[i] = Long.parseLong(data[i]);
      for(int j=0; j<i; j++){
        ans[p] = nums[i]*nums[j];
        p++;
      }
    }
    Arrays.sort(ans);
    System.out.println(ans[index-1]);
  }
}
