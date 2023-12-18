import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt(); //跳ねる回数
		int X = sc.nextInt(); //領域

    int total = 0;
    int ans = 1;
    for(int i = 0; i < N; i++){
      total += sc.nextInt();
      if(total > X){
        break;
      }
      ans++;
    }

    System.out.println(ans);
	}
}