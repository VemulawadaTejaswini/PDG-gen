import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String>ans  = new ArrayList<>();

    for(int i=0; i<n; i++) {
    	String s = sc.next();
    	if(!ans.contains(s)){		
    	      ans.add(s);
    	}
    }
    	System.out.println(ans.size());
      }
}