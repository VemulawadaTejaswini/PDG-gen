import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int max_idx = -1;
		int max = -1;
		for(int i=0;i<n;i++){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if(max<b){
				max_idx = a;
				max = b;
			}
			else if(max==b&&max_idx>a){
				max_idx = a;
			}
		}
		System.out.println(max_idx+" "+max);
	}
}