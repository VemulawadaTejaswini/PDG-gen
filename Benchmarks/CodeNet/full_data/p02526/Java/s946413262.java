import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int cnt = 0;
	    ArrayList S = new ArrayList(); 
	    ArrayList T = new ArrayList();
	    int n = scan.nextInt();
	    for(int i = 0; i < n;i++){
	        S.add(scan.nextInt());
	    }
	    int q = scan.nextInt();
	    for(int i = 0; i < q;i++){
	        T.add(scan.nextInt());
	    }
	    for(int i = 0; i < q; i++){
	        for(int j = 0; j < n; j++){
	            if(T.get(i) == S.get(j)){
	                cnt++;
	                break;
	            }
	        }
	    }
	    System.out.println(cnt);
	}
}