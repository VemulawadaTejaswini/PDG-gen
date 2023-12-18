import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		String result = null;


		if(D==22) {
			result="Christmas Eve Eve Eve";
		}else if(D==23) {
			result="Christmas Eve Eve";
		}else if(D==24) {
			result="Christmas Eve";
		}else if(D==25){
			result="Christmas";
		}

		System.out.println(result);
	}
}