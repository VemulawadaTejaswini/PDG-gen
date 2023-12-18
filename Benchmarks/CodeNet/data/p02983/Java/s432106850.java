import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long min = 2019;
		for(int i = 0; i < 2019; i++){
			for(int j = i+1; j < 2019; j++){
				long x = a+i, y = a+j;
				if(x > b || y > b) break;
				min = Long.min(min, (x*y)%2019);
			}
		}
		System.out.println(min);
	}

}
