import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int N = scan.nextInt();

		int K = scan.nextInt();

		int a[] = new int[N];

		for(int i = 0;i<N;i++){
			a[i] = scan.nextInt();
		}

		if(N%(K-1) == 0){
			System.out.println(N/(K-1));
		}else{
			System.out.println(N/(K-1) + 1);
		}

	}
 
}