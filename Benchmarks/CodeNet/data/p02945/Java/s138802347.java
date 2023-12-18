import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws IOException
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
     int a = Integer.parseInt(tokenizer1.nextToken());
     int b = Integer.parseInt(tokenizer1.nextToken());
     int ans = maximum(a,b);
     System.out.println(ans);
  }
  public static int maximum(int a,int b)
  {
    int x = a + b;
    int y = a - b;
    int z = a * b;
    
    int ans1 = Math.max(x,y);
    int ans = Math.max(ans1,z);
    return ans;
  }
}
