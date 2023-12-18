import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int A = 0;
		int B = 0;
		Scanner sc = new Scanner(System.in);
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		if(A>=13){
			System.out.println(B);
		}
		else if(6<=A&&A<=12){
			System.out.println(B/2);
		}
		else
			System.out.println("0");
	}

}