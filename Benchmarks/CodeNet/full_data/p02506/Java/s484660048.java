import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		W = W.toLowerCase();
		
		int cnt = 0;
		String T;
		while(true){
			if ((T = sc.next()).equals("END_OF_TEXT")){
				break;
			} else if(T.toLowerCase().equals(W)){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}