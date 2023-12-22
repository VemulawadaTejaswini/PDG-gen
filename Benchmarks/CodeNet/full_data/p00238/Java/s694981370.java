import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int t = stdIn.nextInt();
			if(t==0) return;
			int n = stdIn.nextInt();
			int sum = 0;
			for(int i=0;i<n;i++){
				sum+=(-1*(stdIn.nextInt()-stdIn.nextInt()));
			}
			if(sum>=t){
				System.out.println("OK");
			}
			else{
				System.out.println(t-sum);
			}
		}
	}
}