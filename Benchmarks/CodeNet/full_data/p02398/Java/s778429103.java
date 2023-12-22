import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++){
			if(c % i == 0){
				cnt++;
			}
		}
		System.out.printf("%d\n", cnt);
	}
}