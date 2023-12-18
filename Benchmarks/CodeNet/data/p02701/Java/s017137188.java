import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> sList = new ArrayList<String>();
        
        for(int i=0; i<n; i++) {
            String s = sc.next();
            if(!sList.contains(s)) {
                sList.add(s);
            }
        }
        System.out.println(sList.size());
	}
}