import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] b = sc.next().split("");
		String[] c = sc.next().split("");
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a ; i++) {
			sb.append(b[i]);
			sb.append(c[i]);
		}
		
		String result = sb.toString();
		
		System.out.println(result);
	}
}