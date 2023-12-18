import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flg = false;
		
		for (int i=0; i<25; i++){
			for (int j=0; j<14; j++){
				
				if ((i*4 + j*7)==n){
					flg = true;
					break;
				}
			}
		}
		if (flg){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		
		
	}

}
