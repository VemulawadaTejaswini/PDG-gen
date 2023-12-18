import java.util.*;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		
		long L2019 = L%2019;
		long R2019 = R%2019;
		//System.out.println(L2019+" "+R2019);
		if(R2019 <= L2019) {
			System.out.println(0);
			System.exit(0);
		}
		
		
		long min1 = 2018;
		long min2 = 2018;
		//System.out.println(L2019+" "+R2019);
		for(long i= L2019; i <= R2019; i++) {
			long num = i % 2019;
			if(num <= min1) {
				min2 = min1;
				min1 = num;
				if(min1 == 0)break;
				//System.out.println(i+"minA"+min1+" "+min2);
			} else if (num < min2){
				min2 = num;
				//System.out.println(i+ "minB"+min1+" "+min2);
			} else {
				continue;
			}
		}
		
		System.out.println((min1 * min2) % 2019);
	}

}
