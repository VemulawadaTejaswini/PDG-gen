import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int H = 0;
        int M = 0;
        int sum = 0;

      if(m1<m2){
        H = h2 - h1;
        M = m2 - m1;
      }else{
        H = h2 - h1 - 1;
        M = m2+60 - m1;
     }
      sum = M + 60*H;
      if((sum - k)>0){
        System.out.println(sum-k);
      }else{
        System.out.println(0);
      }
    }
}