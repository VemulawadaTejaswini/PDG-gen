import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		for(int c=1;c<4;c++){
			if(A*B*c % 2 !=0){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}	
}