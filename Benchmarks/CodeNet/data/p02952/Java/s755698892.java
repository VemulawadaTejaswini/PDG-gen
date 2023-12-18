import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int p = a;
		int k = 0;
		int result = 0;
		
		while(p>=1) {
			k++;
			p /= 10;
		}
		if(k%2==1) {
			k--;
			result += a - Math.pow(10, k)+1;
		}
		while(k>0) {
			if(k%2==1) {
				result += Math.pow(10, k) - Math.pow(10, k-1);
			}
          k--;
		}
      System.out.println(result);
	}
}