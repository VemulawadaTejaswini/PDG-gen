import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int NoFlag = 0;
		for (int i=0;i<S.length();i++) {
			if((i%2 ==0 && S.charAt(i)=='L' )||(i%2==1 && S.charAt(i)=='R' )){
				NoFlag++;
			}
			else{};	
		}
		if(NoFlag==0){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
		
	