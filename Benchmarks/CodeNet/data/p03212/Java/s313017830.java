import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int flag = 2;
		for (int i = 357; i <= n; i += 2) {
			if (is753(i)) {
				count++;
			}
			flag++;
			if (flag == 3) {
				flag = 0;
				i += 14;
			}
		}
		
		System.out.println(count);
		
	}

	
	public static boolean is753(int x) {
		int count7 = 0;
		int count5 = 0;
		int count3 = 0;
		while (x != 0) {
			switch (x % 10) {
				case 7 :
				count7++;
				break;
				case 5 :
				count5++;
				break;
				case 3:
				count3++;
				break;
				default :
				return false;
			}
			x /= 10;
		}
		return (count7 * count5 * count3 > 0);			
	}
	
}