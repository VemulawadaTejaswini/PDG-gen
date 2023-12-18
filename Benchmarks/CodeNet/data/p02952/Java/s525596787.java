import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		for(int i = 1;i<=x;i++) {
			String temp = String.valueOf(i);
			if(temp.length()%2!=0)count++;
		}
		System.out.println(count);
	}

}
