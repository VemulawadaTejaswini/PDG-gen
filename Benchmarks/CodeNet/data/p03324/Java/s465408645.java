import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
		int ans = 0;
        if(a == 0){a = 1;}
        else if(a == 1){a = 100;}
        else {a = 10000;}
        for(int i = 1;i <= b; i++){
          ans = a * i;
          if(i >= 100){
            ans = a * (i + 1);
          }
        }
        
          System.out.println(ans);

 
      	
 
    }
}