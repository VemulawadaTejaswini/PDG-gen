import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[7];
		
		for(int i = 1; i < 7; i++) {
			a[i] = sc.nextInt();
		}
		
		char []b = sc.next().toCharArray();
		for(int j = 0; j < b.length; j++) {
			if(b[j] == 'S') {
				a[0] = a[2];
				a[2] = a[1];
				a[1] = a[5];
				a[5] = a[6];
				a[6] = a[0];
			}
			else if(b[j] == 'N') {
				a[0] = a[2];
				a[2] = a[6];
				a[6] = a[5];
				a[5] = a[1];
				a[1] = a[0];
			}
			else if(b[j] == 'W') {
				a[0] = a[1];
				a[1] = a[3];
				a[3] = a[6];
				a[6] = a[4];
				a[4] = a[0];
			}
			else{
				a[0] = a[1];
				a[1] = a[4];
				a[4] = a[6];
				a[6] = a[3];
				a[3] = a[0];
			}
		}
		sc.close();
		System.out.println(a[1]);
	}
}

