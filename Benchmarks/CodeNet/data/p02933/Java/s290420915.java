import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
        int list[];
      list = new int[a];
        double result = 0;
        int i;

      for (i = 0; i < a; i++){
        list(i) = (sc.nextInt());
      }
      
      list = Arrays.sort(list);
      result = list.get(0);
      
      for(i = 1; i < a; i++){
        result = (result + list.get(i))/2.0;
      }

      System.out.println(result);
	}
}
