import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		for(int i = 0;i < n;i++){
			if(i % 2 == 0)System.out.print(str.charAt(i));
		}
	}
}