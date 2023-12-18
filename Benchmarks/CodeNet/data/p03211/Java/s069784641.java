import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      int len = s.length(); 
      int ans = 753;
      int x = 0;
      int xx = 753;
      String list[] = s.split("");    
		int[] a = new int[len];
		for(int i=0; i<len; ++i){
			a[i] = Integer.parseInt(list[i]);
		}
      for(int i=0; i<len-2; ++i){
        int x = a[i]*100 + a[i+1]*10 + a[i+2];
        xx = Math.abs(753-x);
        if(ans>xx){
          ans = xx;
        }
      }
      System.out.println(ans);
	}
}
