import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sq = Math.sqrt(n);
		int ans = (int)Math.floor(sq);

		System.out.println(ans*ans);		
  }
}