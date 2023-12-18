import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split(" ");
		String[] b = sc.next().split(" ");
		String c = sc.next();
      
      	if (c == a[0]) {
          b[0] = Integer.toString(Integer.parseInt(b[0])++);
        } else if (c == a[1]) {
          b[1] = Integer.toString(Integer.parseInt(b[1])++);
        }
 
		// 出力
		System.out.println(b[0] + " " + b[1]);
	}
}