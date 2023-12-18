import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
        String ans = "";
        if (x == 2 || y == 2) {
          ans = "No";
        } else {
          ArrayList<Integer> list = new ArrayList<>();
          list.addAll(Arrays.asList(4, 6, 9, 11));
          if (list.contains(x) && list.contains(y)) {
            ans = "Yes";
          } else if ((!list.contains(x)) && (!list.contains(y))) {
            ans = "Yes";
          } else {
            ans = "No";
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}
