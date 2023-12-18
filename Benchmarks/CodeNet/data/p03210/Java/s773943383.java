import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      int len = s.length(); 
      int ans = 0;
      String list[] = s.split("");    
		int[] a = new int[len];
		for(int i=0; i<len; ++i){
			a[i] = Integer.parseInt(list[i]);
		}
	}
}
