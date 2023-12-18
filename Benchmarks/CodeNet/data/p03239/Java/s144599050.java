import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int T = sc.nextInt();
    int[]c = new int[n];
    int[]t = new int[n];
    ArrayList<Integer>ans  = new ArrayList<>();
    
    for(int i=0; i<n; i++) {
    	c[i] = sc.nextInt();
    	t[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++) {
    	if(t[i] <= T) {
    		ans.add(c[i]);
      		}
    	}
    Collections.sort(ans);
    if(ans.size() == 0) {
    	System.out.println("TLE");
    }else {
    	System.out.println(ans.get(0));
    		}
}
}