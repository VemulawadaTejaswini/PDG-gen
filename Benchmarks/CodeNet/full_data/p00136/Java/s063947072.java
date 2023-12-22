import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tmp = sc.nextInt(); 
		double h;
		String[] cnt = {"", "", "", "", "", ""};
		for(int i = 0; i < tmp; i++) {
			h = sc.nextDouble();
			
			if(h >= 185)	cnt[5] += "*";
			else if(h >= 180)	cnt[4] += "*";
			else if(h >= 175)	cnt[3] += "*";
			else if(h >= 170)	cnt[2] += "*";
			else if(h >= 165)	cnt[1] += "*";
			else				cnt[0] += "*";
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i + 1 + ":" + cnt[i]);
		}
	}
}