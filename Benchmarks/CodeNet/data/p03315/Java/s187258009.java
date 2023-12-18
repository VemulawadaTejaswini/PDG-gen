import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strs = str.split("");
		int num = 0;
		for(int i = 0; i < strs.length; i++) {
			if(strs[i].equals("+")){
				num += 1;
			} else {
				num -= 1;
			}
		}
		System.out.println(num);
	}
}