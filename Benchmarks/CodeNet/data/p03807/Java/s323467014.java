import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int countOdd =0;
		for (int i=0; i<a; i++){
			int b = sc.nextInt();
			if (b%2!=0){
				countOdd++;
			}else {
				countOdd+=0;
			}
		}
		if (countOdd%2!=0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}