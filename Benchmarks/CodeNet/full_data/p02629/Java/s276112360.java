import java.util.*;
class Main {
  	static Scanner scan = new Scanner(System.in);
  	public static void main(String[] args) {
  		long N = scan.nextLong();
    	System.out.println(dogName(N));
  	}
 	private static String dogName(long N) {
    	String ans = "";
      	long temp = N;
      	while(temp > 0) {
            temp--;
            long rem = (temp % 26);
        	char cc = (char)('a' + rem);
          	ans = cc + ans;
          	temp /= 26;
        }
       return ans;
 	}
}