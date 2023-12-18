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
          System.out.println(a + i);
          }else{
           break; 
          }
        }
      	for(j = k-1; j >= 0;j--){
          if(b - j > a + i - 1){          
          System.out.println(b - j);
          }
        }
    }
}