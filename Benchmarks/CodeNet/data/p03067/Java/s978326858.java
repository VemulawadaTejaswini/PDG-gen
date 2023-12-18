import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();      
      	
      
      	if(a <= b && a <= c && c <= b){
          System.out.println("Yes");
          return;
        }else if(b <= a && b <= c && c <= a){
          System.out.println("Yes");
          return;          
        }
      
          System.out.println("No");
      
    }
}