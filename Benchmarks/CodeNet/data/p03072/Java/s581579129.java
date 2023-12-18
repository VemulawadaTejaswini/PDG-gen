import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qty = sc.nextInt();
		int[] mnt = new int[qty];
		for(int i=0; i<qty; i++) {
			mnt[i] = sc.nextInt();
		}
		
		int max =mnt[0];
		int cnt = 1;
		
		for(int i=1; i<qty; i++) {
			if(max <= mnt[i]) {
				max = mnt[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}