import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
      
      	if(a>=b&&a>=c){
          if(a=(b+c)){
          	System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }elseif(b>=a&&b>=c){
          if(b==(a+c)){
            System.out.println("Yes");
          }else{
          	System.out.println("No");
          }
        }elseif(c>=a&&c>=b){
          if(c==(a+b)){
            System.out.println("Yes");
          }else{
          	System.out.println("No");
          }
        }
    }
}