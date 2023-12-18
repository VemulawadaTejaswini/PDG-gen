import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] l = new int[n];
      int i;
      int count = 1;
      int place = 0;
      for(i=0;i<n;i++){
        l[i] = sc.nextInt();
      }
      for(i=0;place+l[i]<=x;i++){
        place += l[i];
        count += 1;
      }
      System.out.println(count);
  }
}

