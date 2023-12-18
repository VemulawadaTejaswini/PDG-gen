import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		int countBlack = 0;
		int countWhite = 0;
		for(int i = 0; i < S.length();i++){
			if(S.charAt(i) == '#'){
				countBlack++;
			}else{
				countWhite++;
			}
		}
		if(countBlack > countWhite){
			System.out.println(N - countBlack);
		}else{
			System.out.println(N - countWhite);
		}
	}
}