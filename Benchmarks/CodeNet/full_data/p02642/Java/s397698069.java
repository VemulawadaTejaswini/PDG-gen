import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b[] = new int[a];
      for(int i = 0; i < a; i++){
      	b[i] = sc.nextInt();
      }
		int c = 0;
          int d = 0;
      for(int i = 0; i < a; i++){
            c = 0 ;
        	for(int j = 0; j < a && c < 1; j++){
            	if(b[i] % b[j] == 0){
                	if(i != j){
                  		c++;                    
                    }
                }
            }
        	if(c == 0){
            	d++;
            }
        }
 
		// 出力
		System.out.println(d);
	}
}