import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
      String check = "Yes";
      int[] a = new int[9];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      int x1 = a[3] - a[0];
      int x2 = a[6] - a[3];
      
      if(a[4] != a[1]+x1){
        check="No";
      } if(a[5] != a[2]+x1){
        check="No";
      } if(a[7] != a[4]+x2){
        check="No";
      } if(a[8] != a[5]+x2){
        check="No";
      }
      System.out.println(check);
	}
}
