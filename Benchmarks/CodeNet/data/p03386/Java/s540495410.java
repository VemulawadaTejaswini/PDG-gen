import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int k = sc.nextInt();
        int i,j;
        for(i = 0; i < k;i++){
          if(a + i <= b){
         System.out.println(a+i);
          }
        }
      	for(j = k; k <= 0;j--){
          if(b - i > a + i){          
          System.out.println(b - j);
          }
        }

    }
}