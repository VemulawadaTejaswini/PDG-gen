import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i;
		String[] kotoba= new String[N];
		String cmp;
		char mae,usiro;
		
		cmp = sc.next();
		mae = cmp.charAt((cmp.length()-1));
		kotoba[0] = cmp;
		
		for(i = 1;i < N;i++) {
			cmp = sc.next();
			usiro = cmp.charAt(0);
			if(mae != usiro) {
				System.out.println("No");
				return;
			}
			if(input(cmp,kotoba,i)) {
				System.out.println("No");
				return;
			}
			mae = cmp.charAt(cmp.length()-1);
			kotoba[i] = cmp;
		}
		
		System.out.println("Yes");
		return;
	}
	
	public static boolean input(String word, String[] kotoba,int i) {
		boolean kotae = true;
		for(int j =0;j<i;j++) {
			if(!kotoba[j].equals(word))kotae = false;
			break;
		}
		return kotae;
	}
}