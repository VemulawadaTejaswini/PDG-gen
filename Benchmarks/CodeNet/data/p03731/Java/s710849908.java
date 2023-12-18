import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int t = Integer.parseInt(scan.next());
		int old = Integer.parseInt(scan.next());
		long ans =0;
		int time;
		for(int i = 0; i < n-1; ++i){
			time =Integer.parseInt(scan.next());
			ans+=Math.min(t,time-old);
			old = time;
		}
		System.out.print(ans+t);

	}
}
//end
