import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		int hachi = (int) (A / 0.08);
		int zyuu =  (int)(B / 0.1);

		if (hachi == zyuu){
			System.out.println(hachi);
		}else{
			int as = (int)(hachi * 0.1);
			if (as == B){
				System.out.println(hachi);
			}else{
				double s = 0.1;
				while(s == 1.0){
					double Ap = A + s;
					hachi = (int) (Ap / 0.08);
					as = (int)(hachi * 0.1);
					if (as == B){
						System.out.println(hachi);
						break;
					}
					s = s + 0.1;
				}
				System.out.println(-1);
			}
		}

	}
}