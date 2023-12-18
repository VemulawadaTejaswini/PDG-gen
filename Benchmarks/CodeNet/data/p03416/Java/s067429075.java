import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		System.out.println(ans(A, B));

	}
	public static int ans(int A, int B){
		int count = 0;
		for(int i = A; i <= B; i++){
			if( ((i / 100000) == (i % 10)) && ((i / 10000) % 10 == (i /10) % 10) ){
				count += 1;
			}
		}
		return count;
	}
}

