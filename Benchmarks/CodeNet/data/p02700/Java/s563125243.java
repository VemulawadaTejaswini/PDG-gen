import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();

      for(int i = 0 ; a>0 && c>0; i++){
        c -= b;
        if(c <= 0){
        	System.out.println("Yes");
          	break;
        }
        a -= d;
        if(a <= 0){
        	System.out.println("No");
          break;
        }
        
      }

	}
}