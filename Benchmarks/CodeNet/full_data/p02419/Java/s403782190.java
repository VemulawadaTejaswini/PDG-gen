import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String W = scan.next();
		int cnt = 0;
		for(;;){
			String T = scan.next();
			if(T.equals(END_OF_TEXT)){
				break;
			} else{
				if(T.equals(W)){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}