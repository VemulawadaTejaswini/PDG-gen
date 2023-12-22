import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] time_get = henkan(scan.nextInt());
	
		for(int i = 0; i < 3; i++) {
			if(i != 2) System.out.print(time_get[i] + ":" );
			else System.out.println(time_get[i]);
		}

	}

	static int[] henkan(int time_input) {
		int[] times = new int[3];
		times[0] = time_input / 3600;
		time_input = time_input - times[0] * 3600;
		times[1] = time_input /60;
		times[2] = time_input - times[1] * 60;
		
		return times;
	}
}