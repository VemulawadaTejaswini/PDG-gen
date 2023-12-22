import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 0)System.out.println(1);
		else if(num == 1)System.out.println(0);
		scanner.close();
	}
}