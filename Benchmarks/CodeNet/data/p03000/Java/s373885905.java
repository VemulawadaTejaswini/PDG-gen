import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int p = 0;
		int count = 1;
		for(int i = 0 ; i < N ; i++){
			int q = sc.nextInt();
			p+=q;

			if(p<=X){
				count++;
			}
			else{
				System.out.println(count);
				break;
			}
		}

		if(count == N+1){
			System.out.println(count);
		}


			sc.close();
	}
}
