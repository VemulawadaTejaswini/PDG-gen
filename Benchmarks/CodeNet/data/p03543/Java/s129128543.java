import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[4];
		
		
		
		for(int i=0; i<4; i++){
			x[i] = n % 10;
			n = n / 10;
		}
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		for(int i=0; i<4; i++){
			if (x[0] == x[i]){
				a1++;
			}
			if (x[1] == x[i]){
				a2++;
			}
			if (x[2] == x[i]){
				a3++;
			}
			if (x[3] == x[i]){
				a4++;
			}			
		}
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
		
		
		if ((a1 > 2) || (a2 > 2) || (a3 > 2) || (a4 > 2)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
