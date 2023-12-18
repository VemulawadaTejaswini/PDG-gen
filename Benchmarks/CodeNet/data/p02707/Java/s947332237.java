import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] leadingNum = new int[n];
		
		int index = 0;
		for(int i =0;i<n-1;i++) {
			index = scanner.nextInt();
			leadingNum[index-1]++;
		}
		for (int i : leadingNum) {
			System.out.println(i);
        }
    }

}