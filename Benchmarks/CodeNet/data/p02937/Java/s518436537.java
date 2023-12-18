import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      int n = t.length()*s.length();
      boolean[] dp = new boolean[n];
      
      StringBuilder sb = new StringBuilder(s);

        for (int i=0; i<Math.pow(10,100); i++) {
            sb.append(s);
        }

        String txt = sb.toString();
      
      for(int i = 1;i < n;i++){
      	for(int j = 1;j < t.length();j++)
      		if(txt.substring(0,i).contains(t.substring(j-1,j)) ){
      			dp[i] &= true;
      		}
      }
      
      int count = 0;
      while(dp[n-1]){
      	n--;
        count++;
      }
      System.out.println(count);
    }
}