import java.util.Scanner;
public class Main {
	
	static int Euclid(int a, int b) {
		int ret;
		int excess = a % b;
		if(excess == 0) return(b);
		
		ret = Euclid(b, excess);
		
		return(ret);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			int ans = Euclid(Math.max(a, b), Math.min(a, b));
			System.out.println(ans);
		}
	}

}