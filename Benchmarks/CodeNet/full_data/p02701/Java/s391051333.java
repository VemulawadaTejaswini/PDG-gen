import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a[] = new String[N];
      List<String> shurui = new ArrayList<String>();
      
        for (int i=0; i<N; i++) {
            a[i] = sc.next();
          if(shurui.contains(a[i])){
            continue;
          } else{
            shurui.add(a[i]);
        }      
      }
      
      int shuruiL = shurui.size();
      
		// 文字列の入力
		System.out.println(shuruiL);
	}
}