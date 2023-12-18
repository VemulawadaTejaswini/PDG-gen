import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int[] nums = new int[n];
    int i;
    boolean flag = false;
    nums[n-1] = Integer.parseInt(line[n-1]);
    for(i=n-2; 0<=i; i--){
      nums[i] = Integer.parseInt(line[i]);
      if( nums[i] > nums[i+1] ){
        if( flag ){
          System.out.println("No");
          System.exit(0);
        }else{
          nums[i]--;
          i++;
          flag = true;
        }
      }else
        flag = false;
    }
    System.out.println("Yes");
  }
}
