import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			int d = a.length();
			int e = b.length();
			if(a[d-1] == b[0] && b[e-1] == c[0]){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
	}
}