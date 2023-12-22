import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] xs = new int[5];
		
		int checker = 0;
		
		for(int i = 0 ; i < 5 ; i++){
			xs[i] = sc.nextInt();
			if(xs[i] != i+1){
				checker = i+1;
			}
		}
		
		System.out.println(checker);

	}

}