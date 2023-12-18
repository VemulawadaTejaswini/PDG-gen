import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  String s = sc.next();
      int min=753;
      for(int i=0;i<s.length()-2;i++){
        String str = s.substring(i,i+3);
        int n = Integer.parseInt(str);
        int d = Math.abs(753-n);
        min = Math.min(min,d);
      }
       System.out.println(min);
    }
}