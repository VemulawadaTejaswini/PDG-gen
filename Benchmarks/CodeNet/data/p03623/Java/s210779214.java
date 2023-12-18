import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
                int x,y;
                x = Math.abs(a-b);
                y = Math.abs(a-c);
               if(x > y){
                   System.out.println("B");
               }else{
                   System.out.println("A");
              }
	}
}