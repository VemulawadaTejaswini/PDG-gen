import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
		HashSet hs = new HashSet();
		long cnt = 0;
		
		for(int i = 0;i < nam;i++){
		     hs.add(in.next()); 
		}
      
      System.out.println(hs.size());
	}
}