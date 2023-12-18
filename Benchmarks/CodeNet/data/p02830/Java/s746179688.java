import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String f = sc.next();
		String b = sc.next();
		String[] c = new String[a];
		String[] d = new String[a];
		String e = "";
		for(int i = 0; i < a; i++){
			c[i] = f.substring(i, i + 1);
		} 
		for(int i = 0; i < a; i++){
			d[i] = b.substring(i, i + 1);
		}
		for(int i = 0; i < a; i++){
			e += c[i] + d[i];
		}
		System.out.println(e);
		
		
	}
}