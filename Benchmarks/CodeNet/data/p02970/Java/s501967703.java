import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int per = d*2+1;
		
		int ans = (n%per == 0) ? n/per : n/per+1;
		
		System.out.println(ans);
	}

}
