import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
      String[] split = input.split(" ");
        int totalPower = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
      int[] n1 = new int[n];
      String a = br.readLine();
      String[] split1 = a.split(" ");
      int sum =0;
      boolean canBreak = false;
      for(int i=0;i<n;i++){
        n1[i]= Integer.parseInt(split1[i]);
        sum+=n1[i];
        if(totalPower<=sum){
          System.out.println("Yes");
          canBreak = true;
          break;
      }
      }
      if(canBreak == false){
          System.out.println("No");
      }
     
    
}
}
