import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int count=0;

		for(int i=Math.max(a, b);i>=1;i--) {
			if(a%i==0&&b%i==0) {
				count++;
			}
			if(count==k) {
				System.out.println(i);
				break;
			}
		}
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


