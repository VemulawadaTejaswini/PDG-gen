import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
     	int b = sc.nextInt();
      
        if(a == b ){
          System.out.println("Draw");
        }else if(a > b && b != 1){
          System.out.println("Alice");
        }else{
          System.out.println("Bob");
        }
    }
}