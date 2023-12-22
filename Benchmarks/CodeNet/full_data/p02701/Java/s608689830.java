import java.util.*;
import java.util.HashSet;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	    int N = sc.nextInt();
        HashSet list = new HashSet();
      
      for(int i=0 ;i < N; i++){
        String prize = sc.next();
        list.add(prize);
      }
      
      System.out.println(list.size());
      
    }
}
