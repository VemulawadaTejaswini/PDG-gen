import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		final int B = sc.nextInt();
		int C = sc.nextInt();
		final int D = sc.nextInt();
		sc.close();
		while(true){
			C -= B;
			if(C <= 0) break;
			A -= D;
			if(A <= 0) break;
		}
		if(C <= 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
