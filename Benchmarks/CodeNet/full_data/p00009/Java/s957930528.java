import java.util.Scanner;
public class Main {
	static void toNum(int[] ary, int limit) {
		for(int r = 2; r <= limit; r++) {
			ary[r] = 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Scanner cin = new Scanner(System.in);
		
		while(++counter != 30) {
			int[] ary = new int[1000000];
			int ans = 0;
			int num = cin.nextInt();
			toNum(ary, num);
			
			for(int r = 2; r < Math.sqrt(num); r++) {
				for(int c = 2; r * c <= num; c++) {
					ary[r * c] = 0;
				}
			}
		
			for(int r = 2; r <= num; r++)
				if(ary[r] == 1)
					ans++;
			
			System.out.println(ans);
		}
	}
}