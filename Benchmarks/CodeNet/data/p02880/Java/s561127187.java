import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		scanner.close();
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,12,14,15,16,18,20,21,24,25,27,28,30,
				32,35,36,40,42,45,48,49,54,56,63,64,72,81};
		boolean flg = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == num) {
				System.out.println("Yes");
				flg = true;
				break;
			}
		}
		
		if(!flg) {
			System.out.println("No");
		}
	}

}

