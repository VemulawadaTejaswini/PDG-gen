import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int L = sc.nextInt();
		int R = sc.nextInt();
      	int mod = 2019;
		
      for(int i=L;L<=R-1;i++){
        for(int j=i+1;j<=R;j++){
          if((i*j)%2019 < mod){
            mod = (i*j)%2019;
          }
        }
      }
		// 出力
		System.out.println(mod);
	}
}