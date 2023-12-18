import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

      int sun = 0;
      for(int i = 0 ; i <= n ; i++){
      	int count = 0;
        int p = i;
        while(true) {
        	count += p % 10;
          p = p / 10;
          if ( p == 0) {
          	if ( count >= a && count <= b) {
            	sun += i;
            }
            break;
          }
          
        }
      }
      
		System.out.println(sun);
	}
}