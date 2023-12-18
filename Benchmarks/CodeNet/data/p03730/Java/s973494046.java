import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
      	int i;
      	for(i = 1; i<= 100; i++){
          if((a * i) % b == c){
            System.out.println("Yes");
            System.exit(0); 
          }
        } 
            System.out.println("No");
	}
} 