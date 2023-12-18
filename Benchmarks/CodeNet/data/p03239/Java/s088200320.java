import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
      int T = scn.nextInt();
      int x = 1000000;
      int y = 0;
      int[] a = new int[n*2];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      for(int i=1; i<a.length; i+=2){
        if(x > a[i]){
          x = a[i];
          y = a[(i-1)];
        }
      }
      if(x<=T){
        System.out.println(y);
      }else{
        System.out.println("TLE");
      }
	}
}
