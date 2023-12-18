import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int n = sc.nextInt();
      int[] l = new int[n];
      int i;
      int leng = 0;
      for(i=0;i<n;i++){
        l[i] = sc.nextInt();
      }
      Arrays.sort(l, Collections.reverseOrder());
      for(i=0;i<k;i++){
        leng += l[i];
      }
      System.out.println(leng);

  }
}

