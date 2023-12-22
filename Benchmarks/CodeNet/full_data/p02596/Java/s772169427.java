import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
    int row = 7 % k;

    //数列の定義
    for(int i = 0; i < k ; i++ ){
			if(row == 0){
					System.out.println(i+1);
					break;
			}
      row = (row * 10 + 7) % k;
      System.out.println(row);
    }
	}
}
