import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList ar = new ArrayList();
		for(int i = 0; i < n; i++){
		    ar.add(sc.nextInt());
		}
		Collections.sort(ar);
		int ret = 0;
		for (int i = 0; i < k ; i++){
		    ret += ar.get(ar.size()-i);
		} 
		
	    System.out.println(ret);
    }
}
