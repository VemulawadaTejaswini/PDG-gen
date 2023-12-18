import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] num = new int[5];
    int ans = 0;
    int min = 10;
    for(int i=0; i<5; i++){
      num[i] = Integer.parseInt(in.readLine());
      if(num[i]%10==0)
        ans += num[i];
      else
        ans += (num[i]/10)*10+10;
      
      if(num[i]%10!=0)
       min = Math.min(num[i]%10,min);
    }
    System.out.println(ans-10+min);
  }
}