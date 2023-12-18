import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] w = new int[n];
      int s1 = 0;
      int s2 = 0;
      int count = 0;
      for(int i = 0;i < n;i++){
      	w[i] = sc.nextInt();
        s1 += w[i];
      }
      for(int i = 0;i < n && s1 > s2;i++){
      	s1 -= w[i];
        s2 += w[i];
        if(s1-s2 <= w[i+1]*2){
          count = i+1;
          break;
        }
      }
      System.out.println(Math.min(Math.abs(s1-s2),Math.abs(s1-s2-w[count]*2)));
    }
}