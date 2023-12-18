import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A =scan.nextInt();
		int B =scan.nextInt();
		
		if(A>B){
			System.out.println("GREATER");
		}else if(B>A){
			System.out.println("LESS");
		}else{
			System.out.println("EQUAL");
		}

	}}