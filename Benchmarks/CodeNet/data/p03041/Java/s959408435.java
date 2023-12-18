import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		StringBuilder ans =new StringBuilder(S);
		if(S.charAt(K-1)=='A'){		
		ans.replace((K-1),(K-1),"a"); 
		}
		if(S.charAt(K-1)=='B'){		
		ans.replace((K-1),(K-1),"b"); 	
		}
		if(S.charAt(K-1)=='C'){		
		ans.replace((K-1),(K-1),"c");			
		}

		System.out.println(ans);	
		}
	}
