import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}
	static boolean read(){
		number = sc.nextInt();
		if(number == -1)
			return false;
		return true;
	}
	static void slove(){
		String four = Integer.toString(number, 4);
		System.out.println(four);
	}
}