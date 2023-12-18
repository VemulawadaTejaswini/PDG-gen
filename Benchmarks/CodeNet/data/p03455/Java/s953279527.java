import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        if((a*b) % 2 == 0){
          // 正の整数a,bの積に対する剰余2が0であればEven
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
	}
}
