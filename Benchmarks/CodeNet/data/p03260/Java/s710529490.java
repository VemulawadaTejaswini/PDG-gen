import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();
	public static void main(String[] args){
		Main aa = new Main();
		System.out.println(aa.num(aa.a,aa.b));
	}
	String num(int a, int b){
		if((double)a*b/2-Math.floor((double)a*b/2) == 0){
			return "No";
		}else{
			return "Yes";
		}
	}
}