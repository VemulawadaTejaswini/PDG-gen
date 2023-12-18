import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
    ArrayList<Integer>ans  = new ArrayList<>();
    
    int a = 0;
    for(int i=0; i<S.length()-2; i++) {
    	a = 753 - ((ss[i]-48)*100 + (ss[i+1]-48)*10 + (ss[i+2]-48));
    	a = Math.abs(a);
    	ans.add(a);
    }
    Collections.sort(ans);
    	System.out.println(ans.get(0));
    }
}
