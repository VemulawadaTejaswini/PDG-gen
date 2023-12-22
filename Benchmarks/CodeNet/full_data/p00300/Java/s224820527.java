import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	Scanner scan;
	private final int interval_deg = 30;
	private final int interval_r = 100;

	private int N;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();

		for(int i = 0;i < N;i++) {
			System.out.println(looprun(scan.nextInt(),scan.nextInt()));
		}

		scan.close();
	}

	private String looprun(double r,double deg) {
		String ans = "";
		int p = (int) (r / interval_r + (int)(deg / interval_deg) * 5);
		ans += p;
		if(r % interval_r != 0) {
			ans += " " + (p + 1);
		}
		if(deg % interval_deg != 0){
			ans += " " + (p + 5);
		}
		if(deg % interval_deg != 0 && r % interval_r != 0){
			ans += " " + (p + 6);
		}

		return ans;
	}
}

