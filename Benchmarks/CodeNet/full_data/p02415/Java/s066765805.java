import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for(int i = 0; i < b.length; i++){
			if(b[i] >= 'a' && b[i] <= 'z' ){
				b[i] -= 32;
			} else if(b[i] >= 'A' && b[i] <= 'Z'){
				b[i] += 32;
			}
		}
		System.out.println(String.valueOf(b));
	}
}
