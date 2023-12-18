import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
    
		// 出力
		System.out.println(check(s) ? "AC" : "WA");
	}
    public static boolean check(String value) {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0; i < value.length(); i++) {
        if (Character.isUpperCase(value.charAt(i))) {
          list.add(i);
        }
      }
      if (list.size() != 2) {
        return false;
      }
      if (list.get(0) != 0) {
        return false;
      }
      if (list.get(1) < 2 || list.get(1) > value.length() - 2) {
        return false;
      }
      if (!String.valueOf(value.charAt(0)).equals("A")) {
        return false;
      } 
      return String.valueOf(value.charAt(list.get(1))).equals("C");
   }
      
}
