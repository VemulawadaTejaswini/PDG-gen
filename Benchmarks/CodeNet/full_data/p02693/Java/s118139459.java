import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt(); //倍数
		int A = scan.nextInt(); //最低値
		int B = scan.nextInt(); //最高値
		String ans = "NG";
		
      
		for(int i = A; i>=B; i++){
			if(i % K == 0){
				ans = "OK";
				break;
			}
		}
		
		System.out.println(ans);

	}
}
