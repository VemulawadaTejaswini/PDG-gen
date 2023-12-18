import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] monsters =new int[n];
		for (int i=0;i<n;i++){
			monsters[i]=sc.nextInt();
		}
		Arrays.sort(monsters);

		long hp =0;
		if (k>=n) {
			System.out.println(hp);
		} else{
			for (int j=0;j<n-k;j++) {
				hp += monsters[j];
			}
			System.out.println(hp);

		}



		//------------------------------------------------------------
	}
}