import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> s = new ArrayList<String>();
       int k = 0;
      
        for (int i=0; i<N; i++) {
            String a = sc.next();
          if(!s.contains(a)){
            s.add(a);
            k = k+1;
        }      
      }
		// 文字列の入力
		System.out.println(k);
	}
}