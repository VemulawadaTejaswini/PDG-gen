import java.util.*;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		long L2019 = L % 2019;
		long R2019 = R % 2019;
		
		if(L/2019 != R/2019 || L2019 == 0) {
			System.out.println(0);
			return;
		}
		
		System.out.println(L2019* (L2019+1)%2019);
	}

}
