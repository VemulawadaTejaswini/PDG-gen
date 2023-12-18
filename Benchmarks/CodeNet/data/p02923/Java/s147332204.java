import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      int count = 0;
      int max = 0;
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      for(int i=0; i<a.length-1; ++i){
        if(a[i]>=a[i+1]){
          count = count+1;
          if(max<count){
            max = count;
          }
        }else{
          if(max<count){
            max = count;
          }
          count = 0;         
        }
      }
      System.out.println(max);
	}
}
