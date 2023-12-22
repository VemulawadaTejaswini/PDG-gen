import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        int hole = Math.abs(a-b);
        int amax = v * t;
        int bmax = w * t;
        int tag = amax - bmax;
        if(tag <= 0){
          System.out.println("NO");
          return;
        }else{
          if(hole > tag){
            System.out.println("NO");
            return;
          }
        }
        
        System.out.println("YES");
    }
}