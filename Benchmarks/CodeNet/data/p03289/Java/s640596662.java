import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();

		for (int i=0; i<S.length; i++){
			if (i == 0){
				if (S[i] != 'A'){
					System.out.println("WA");
					return;
				}
			}else if (i == 2){
				if (S[i] != 'C'){
					System.out.println("WA");
					return;
				}
			}else if (Character.isUpperCase(S[i])){
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
		return;
	}
}
