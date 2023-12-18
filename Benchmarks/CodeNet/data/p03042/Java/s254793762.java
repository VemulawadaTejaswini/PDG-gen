import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int f = Integer.parseInt(S.substring(0, 2));
		int l = Integer.parseInt(S.substring(2, 4));

		boolean fBool = 0 < f && f < 13;
		boolean lBool = 0 < l && l < 13;

		if(fBool && lBool){
			System.out.println("AMBIGUOUS");
		} else if(fBool && !lBool){
			System.out.println("MMYY");
		} else if(!fBool && lBool){
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}

	}
}