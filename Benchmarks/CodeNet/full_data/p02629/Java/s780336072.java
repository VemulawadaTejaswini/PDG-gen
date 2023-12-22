import java.util.*;
class Main {
  	static Scanner scan = new Scanner(System.in);
  	public static void main(String[] args) {
  		int N = scan.nextInt();
    	System.out.println(dogName(N));
  	}
 	private static String dogName(int N) {
    	String ans = "";
      	int temp = N;
      	while(temp > 0) {
            temp--;
            int rem = (temp % 26);
        	char cc = (char)('a' + rem);
          	ans += cc;
          	temp /= 26;
        }
       return ans;
 	}
}