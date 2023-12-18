import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long aa = 0;
		long ans =0;

		if(a % x != 0){
			 ans =  b/x -a/x ;
		}else{
			 ans =  b/x -a/x + 1;

		}
			
			System.out.println(ans);

		
	}
}