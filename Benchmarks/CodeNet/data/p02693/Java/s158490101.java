import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		// スペース区切りの整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
      int largest=(B/K)*K
		if(largest>A){
        	System.out.println("OK");
        }
        else{
        	System.out.println("NG");
        }
	}
}
