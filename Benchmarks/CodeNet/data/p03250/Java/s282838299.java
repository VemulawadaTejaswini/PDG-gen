import java.util.*;

class Main {
	public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
      	int a = s.nextInt();
      	int b = s.nextInt();
      	int c = s.nextInt();
      	int big = max(max(a,b),c);
      	int small = min(min(a,b),c);
      	int med;
      	if( a!= small && a!= big) {
        	med = a;
        } else if( b!= small && b!= big) {
        	med = b;
        } else {
        	med = c;
        }
      	int ans = big*10+med+small;
      	System.out.println(ans);
    }
  	static int max (int a, int b) {
      return a > b ? a : b;
    }
  	static int min(int a, int b) {
    	return a < b ? a: b;
    }
}
