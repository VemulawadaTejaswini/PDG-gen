import java.util.*;
public class Main {
	
	public static long mensa(long Sa, long Sb, long Sc) {
		return Math.max(Math.abs(Sa-Sb), Math.max(Math.abs(Sb-Sc), Math.abs(Sc-Sa)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		long ans = Integer.MAX_VALUE;
		long Sa, Sb, Sc;
		for(int i = 1; i < H; i++) {
			Sa = i*W;
			Sb = (H-i)*(W/2);
			Sc = (H-i)*(W-W/2);
			ans = Math.min(ans, mensa(Sa, Sb, Sc));
			Sb = (H-i)/2*W;
			Sc = (H-i-(H-i)/2)*W;
			ans = Math.min(ans, mensa(Sa, Sb, Sc));
		}
		for(int i = 1; i < W; i++) {
			Sa = i*H;
			Sb = (W-i)*(H/2);
			Sc = (W-i)*(H-H/2);
			ans = Math.min(ans, mensa(Sa, Sb, Sc));
			Sb = (W-i)/2*H;
			Sc = (W-i-(W-i)/2)*H;
			ans = Math.min(ans, mensa(Sa, Sb, Sc));
		}
		System.out.println(ans);
	}

}
