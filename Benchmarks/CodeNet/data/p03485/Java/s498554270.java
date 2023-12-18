import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		
      	int avg = (a + b)/2
      	if ((a+b) %2 == 0){
          System.out.println(avg);
        } else{
          System.out.println(avg+ 1);
        }
	}
}