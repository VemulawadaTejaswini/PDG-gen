import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		  Scanner sc = new Scanner(System.in);
		  
		  int N = sc.nextInt();
		  int Y = sc.nextInt();
		  
		  String ans = (-1 + "　" + -1 + "　" + -1);
		  
		  for(int i = 0; i < N; i++) {
			  for(int j = 0; j < N; j++) {
				  int z = N-i-j;
				  if(z>=0) {
					  int a = (10000*i) + (5000*j) + (1000*z);
					  if(a == Y) ans = i + "　" + j + "　" + z;
				  }  
			  }
		  }
		  System.out.println(ans);
		  

	}

}
