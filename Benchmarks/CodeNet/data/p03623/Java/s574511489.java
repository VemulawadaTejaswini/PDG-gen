import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int bb = 0;
		int cc = 0;
		bb = a - b;
		cc = a - c;
		bb = Math.abs(bb);
		cc = Math.abs(cc);
		if(bb < cc){
			System.out.println(bb);
		}else if(bb > cc){
			System.out.println(cc);
		}
		
	}

}