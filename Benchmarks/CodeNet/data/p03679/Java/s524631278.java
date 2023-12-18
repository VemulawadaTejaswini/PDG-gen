import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int aBefore = sc.nextInt();
		int bAfter = sc.nextInt();
		if (aBefore >= bAfter) {
			System.out.println("delicious");
		}else if (aBefore - bAfter >= x) {
			System.out.println("safe");
		}else{
			System.out.println("dangerous");
		}
	}
}