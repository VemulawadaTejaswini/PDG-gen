
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if( n == 0)
				break;
			int [] data = new int[n];
			for(int i=0; i < n; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			int sum = 0;
			for(int i=1; i < n - 1;i++){
				sum += data[i];
			}
			System.out.println(sum /  (n - 2));
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}