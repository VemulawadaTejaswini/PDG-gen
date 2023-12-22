import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int num;
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++){
			read_and_solve();
		}
	}
	static void read_and_solve(){
		int res = 0;
		int temp = 0;
		name = sc.next();
		num = sc.nextInt();
		temp = num;
		res = num*200;
		num = sc.nextInt();
		res = res + num*300;
		num = num + temp;
		System.out.println(name + " " + num + " " + res);
	}

}