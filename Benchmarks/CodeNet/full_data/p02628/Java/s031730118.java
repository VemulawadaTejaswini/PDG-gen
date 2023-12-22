import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b  = sc.nextInt();
        int c[] = new int[a];
        long ans = 0;
      
        for(int i = 0;i < a;i++){
          c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        for(int i = 0;i < b;i++){
          ans += c[i];
        }
      
      	System.out.println(ans);
 
    }
}