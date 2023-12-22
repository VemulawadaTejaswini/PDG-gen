import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String result = "";
		if (y%2==0&&(2*x-y/2)>=0&&x<y) {
			result = "Yes";
		} else {
			result = "No";
		}
		System.out.print(result);
		sc.close();
	}
}