import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int com;
		
		for ( com = M/N ; com > N ; com--){
			if( M%com == 0){	
				break;
			}
		}
		if(com>N){
			System.out.println(com);
		}
		else{
			System.out.println(1);
		}
	}
}
