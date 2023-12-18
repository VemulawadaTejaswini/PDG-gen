import java.util.*;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		long obj1 = sc.nextLong();
		long obj2 = sc.nextLong();
      	long obj3 = obj1;
      	for (int i=0; obj1 < obj2; obj1++) {
    	  // 条件式がtrueのときに繰り返す処理
          obj3 = obj3 ^ obj1 + 1;
		}
        
		System.out.println(obj3);
		
	}
}	
