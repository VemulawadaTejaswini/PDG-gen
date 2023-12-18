import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      // 予報
		String s = sc.next();
      // 実績
      String t = sc.next();
      
      int count=0;
      
      for(int i = 0;i<s.length();i++){
          String s1=s.substring(i,i+1);
          String s2=t.substring(i,i+1);
          
        if(s.equals(t)){
          count++;
        }
      }
		// 出力
		System.out.println(count);
	}
}