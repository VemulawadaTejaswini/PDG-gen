import java.util.Scanner;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int max = 100000001;
		int [] sosuu = new int [max];
		int [] n = new int [10000];
		int count = 0;
 
		for (int i = 1; i <= max - 1; i++) {
			sosuu[i] = 1;
		}
		sosuu[0] = 0;
		sosuu[1] = 0;
 
		for (int i = 2; i <= 10000; i++) {
			if (sosuu[i] == 1) {
				for (int j = i + i; j <= max - 1; j += i) {
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