import java .util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Set<String> s = new HashSet<String>();
	for(int i=0;i<n;i++){
	    s.add( sc.next() );
	}
	System.out.print(s.size());
    }
}
