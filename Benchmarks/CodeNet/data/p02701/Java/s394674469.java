import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      List<String> shurui = new ArrayList<String>();
      
        for (int i=0; i<N; i++) {
            String a = sc.next();
          if(shurui.contains(a)){
            continue;
          } else{
            shurui.add(a);
        }      
      }
      
      int shuruiL = shurui.size();
      
		// 文字列の入力
		System.out.println(shuruiL);
	}
}