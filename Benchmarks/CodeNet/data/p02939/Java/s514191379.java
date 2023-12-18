import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int res = s.length;
		for(int i = 0; i < s.length-1; i++){
			if(s[i] == s[i+1]){
				res--; i+=2;
			}
		}
		System.out.println(res);
	}

}
