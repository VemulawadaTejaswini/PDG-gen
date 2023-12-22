import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] l = new long[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextLong();
		}
		for(int i = 0; i < n-2; i++) {
			long temp1 = l[i];
			for(int j = i+1; j< n-1; j++) {
				long temp2 = l[j];
				for(int k = j+1; k < n; k++) {
					long temp3 = l[k];
					if(temp1+temp2 > temp3&&
							temp1+temp3>temp2&&
							temp2+temp3>temp1) {
						if(temp1 != temp2 &&temp1 != temp3  &&
								temp2 != temp3) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}