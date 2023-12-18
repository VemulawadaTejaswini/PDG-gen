import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int min = (N-1) * A + B;
		int max = A + (N-1) * B;

		if(A!=B && N==1){
			System.out.print(0);
		}else if(A>B){
			System.out.print(0);
		}else if(A<=B){
			System.out.print(max-min+1);
		}

	}

}