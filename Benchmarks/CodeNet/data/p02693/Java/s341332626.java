import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String str = null;
		for(int i = A;i <= B;i++) {
			if(i % K == 0) {
				str = "OK";
			}
		}
		if(str != null) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}