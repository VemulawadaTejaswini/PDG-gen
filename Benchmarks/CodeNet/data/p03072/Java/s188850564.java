import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int n = sc.nextInt();
		int nn[] = new int[n];
		int max = 0;

		for(int i=0; i<n; i++) {
			nn[i] = sc.nextInt();
		}
		max = nn[0];
			for(int j=0; j<n; j++) {
				if(j != 0) {
					if(nn[j] > max) {
						max = nn[j];
					}
					if(nn[j] > nn[j-1]) {
						count++;
					}
				}
			}
			if(max == nn[0])
				count = 1;

		System.out.println(count);
	}

}
