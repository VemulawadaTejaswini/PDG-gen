import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		String[] b = sc.nextLine().split(" ");
		String c = sc.nextLine();
      
      	if (c == a[0]) {
          b[0] = Integer.toString(b[0]++);
        } else if (c == a[1]) {
          b[1] = Integer.toString(b[1]++);
        }
 
		// 出力
		System.out.println(b[0] + " " + b[1]);
	}
}