import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			String [] input = sc.next().split(":");
			int h = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			double hdeg = h * 30 + (double)m / 2;
			double mdeg = m * 6;
			double diff = Math.abs(hdeg - mdeg);
			if(diff >= 181){
				diff = 360 - diff;
			}
			if(diff < 30){
				System.out.println("alert");
			}
			else if(90 <= diff && diff <= 180){
				System.out.println("safe");
			}
			else{
				System.out.println("warning");
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}