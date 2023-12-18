import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A =scan.nextLong();
		long B =scan.nextLong();
		
		if(A>B){
			System.out.println("GREATER");
		}else if(B>A){
			System.out.println("LESS");
		}else{
			System.out.println("EQUAL");
		}

	}}