import java.util.*;
 
public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num = 0;
		String str = null;
		for(int i = A;i <= B;i++) {
			if(num / K == 0) {
				str = "OK";
			}
		}
		if(str.equals("OK")) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}