import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int As = A * 100 / 8;
		int Al = ((A+1) * 100 - 1) / 8;
		int Bs = B * 10;
		int Bl = ((B+1) * 100 - 1) / 10;
		if(Bs <= Al && As <= Bl) {
			int ans = As;
			while(true) {
				if(ans >= Bs)
					break;
				ans++;
			}
			System.out.println(ans);
		}
		else 
			System.out.println(-1);
	}

}