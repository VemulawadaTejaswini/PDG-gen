import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for(;;){
			
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			int count = 0;
			for(int i = 1; i < 1001;i++){
				for(int j = i+1 ; j < 1001;j++){
					if((i+j)*(j-i+1)/2  == n){
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
			
			
		
	}
}

