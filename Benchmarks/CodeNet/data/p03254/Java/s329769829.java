import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      int x = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      Arrays.sort(a);
      int count = 0;
      for(int i=0; i<a.length; ++i){
        if(x>=a[i]){
          x = x - a[i];
          count = count + 1;
        }
      }
      System.out.println(count);
	}
}