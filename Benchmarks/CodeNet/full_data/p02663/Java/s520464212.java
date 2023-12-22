import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
      		int m2 = sc.nextInt();
		int k = sc.nextInt();
//計算
      if(m1>m2){
      h2-=1;
        m2+=60;
      }
      int h=0;
      h=h2-h1;
      int m=0;
      m=m2-m1;
      int total=0;
      total=(h*60)+m-k;
      
		// 出力
		System.out.println(total);
	}
}