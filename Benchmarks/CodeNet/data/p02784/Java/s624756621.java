import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
      	int n = sc.nextInt();
        int a[] = new int[n];
        int i;
		// 出力
      for(i = 0; i < n; i++){
        h -= sc.nextInt();
      }
	  if(h <= 0){
            System.out.println("Yes");
      }else {
            System.out.println("No");  
      }
	}
}