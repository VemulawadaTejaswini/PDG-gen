import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();
    ArrayList<Integer>ans  = new ArrayList<>();
    
    int all = 0;
    for(int i=0; i<n; i++) {
    	if(ss[i] == 'I' ) {    
    		all += 1;
    	}else {
    		all += -1;
    	}
    	ans.add(all);
    	Collections.sort(ans,Collections.reverseOrder());	
    	}
    System.out.println(Math.max(0, (ans.get(0))));
      }
}