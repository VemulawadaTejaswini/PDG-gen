import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] sosuu = new int [10001];
		int [] n = new int [10000];
		int count = 0;
		
		for (int i = 1; i <= 10000; i++) {
			sosuu[i] = 1;
		}
		sosuu[0] = 0;
		sosuu[1] = 0;
		
		for (int i = 2; i <= 100; i++) {
			if (sosuu[i] == 1) {
				for (int j = i + i; j <= 10000; j += i) {
					sosuu[j] = 0;
				}
			}
			
		}
		
		Scanner cin = new Scanner (System.in);
		int x = cin.nextInt();
		
		for (int i = 0; i < x; i++) {
			n[i] = cin.nextInt();
			if (sosuu[n[i]] == 1) count++;
		}
		
		System.out.println(count);
	}
	
	//private static void sosuulist() {
	//	
	//}
}