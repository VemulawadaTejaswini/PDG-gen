import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[]s  = new String[n];
    ArrayList<String>ans  = new ArrayList<>();


    for(int i=0; i<n; i++) {
    	s[i] = sc.next();
    	if(!ans.contains(s[i])){		
    	      ans.add(s[i]);
    	}
    }
    	System.out.println(ans.size());
      }
}