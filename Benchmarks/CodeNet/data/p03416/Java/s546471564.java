import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
       
        for(int i = a; i <= b; i++) {
          String value = "" + i;
          int size = (int)Math.floor(value.length() / 2);
          String front = value.substring(0, size);
          String back = value.substring(value.length() - size, value.length());
          StringBuilder builder = new StringBuilder();
          builder.append(back);
          if (front.equals(builder.toString())) {
            ans++;
          }
        }        
    
		// 出力
		System.out.println(ans);
	}
}
