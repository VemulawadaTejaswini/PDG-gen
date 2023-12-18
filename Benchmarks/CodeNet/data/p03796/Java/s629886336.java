import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long pow = 1;
		for(int i = 0;i <n;i++) {
			pow = pow *(i+1);
			pow = pow % 1000000007;
		}
		System.out.println(pow);
	}

}
