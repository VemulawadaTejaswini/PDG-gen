import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int ans = 0;
		
		for(int i=0; i<=k; i++) {
			for(int j=0; j<k-i; j++) {
				if(i+j+(s - (i*10000 + j*5000)) / 1000 == k) {
					System.out.println(i + " " + j + " " + (s - (i*10000 + j*5000)) / 1000);
                  return;
				}
			}
		}
      System.out.println((-1) + " " + (-1) + " " + (-1));
	}
}