import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
		boolean result = true;
      
      if (a == b && a == c) {
        result = false; // すべて同じ
      } else if (a == b && a != c) {
        result = true; // cだけ違う
      } else if (a != b && b == c) {
        result = true; // aだけ違う
      } else if (a != b && b != c && a != c) {
        result = false; // abcすべて違う
      } else if (a == c && a != b) {
        result = true; // bだけ違う
      }
		System.out.println(result? "Yes": "No");
	}
}