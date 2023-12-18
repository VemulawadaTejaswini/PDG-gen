import java.util.*;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] s = new int[3];
      s[0] = sc.nextInt();
      s[1] = sc.nextInt();
      s[2] = sc.nextInt();
      int ans=0;
      for(int i=0; i<3; i++)if(s[i]==1)ans++;
      return ans;
    }
}