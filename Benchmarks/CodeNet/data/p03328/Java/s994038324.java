import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
		int ans = 0;
        for(int i = 1;i <= 999; i++){
          ans = ans + i;
          if(a < ans){
            break;
          }
        }
        ans = ans - a;
        
        System.out.println(ans);

 
      	
 
    }
}