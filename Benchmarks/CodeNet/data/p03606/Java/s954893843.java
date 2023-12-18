import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n =sc.nextInt();
      int[] ldata = new int[n];
      int[] rdata = new int[n];
      int count = 0;

      for (int i = 0;i<n ;i++ ) {
        ldata[i] = sc.nextInt();
        rdata[i] = sc.nextInt();
      }
      for (int j = 0;j<n ;j++ ) {
          int i  = 0;
          for ( i = ldata[j];i<=rdata[j] ;i++ ) {
          count++;
        }
      }
      System.out.println(count);



}
}
