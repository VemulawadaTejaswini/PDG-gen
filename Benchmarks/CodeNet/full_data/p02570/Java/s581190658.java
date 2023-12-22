import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		float D = sc.nextInt();
		float T = sc.nextInt();
		float S = sc.nextInt();
      	if (D/S <= T){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}
