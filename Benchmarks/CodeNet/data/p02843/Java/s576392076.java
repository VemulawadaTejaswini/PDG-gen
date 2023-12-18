import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t = n/100;
            int s = n%100;
            int u = s/5;
            if(s%5!=0){
                u++;
            }
            int ans = (t>=u) ? 1 : 0;
            System.out.println(ans);

	}
}
