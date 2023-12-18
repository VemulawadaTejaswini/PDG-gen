import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long ans = 0;
		if(A==1&B==1){
			ans = 0;
		}
		else if(A == 1 ||B == 1){
			ans = Math.max(A, B)-2;
		}else{
			ans = (A-2)*(B-2);

		}

		System.out.println(ans);


	}


}
