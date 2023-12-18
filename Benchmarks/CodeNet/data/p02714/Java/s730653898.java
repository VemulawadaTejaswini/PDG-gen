
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();String s = sc.next();
	//	System.out.println(s);
		int res = 0 ;
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = i+1 ; j < s.length() ; j ++) {
				for(int k = j+1 ; k < s.length() ; k++ ) {
					//System.out.println(i+"  "+j+"  "+k);
					if(s.charAt(i)!=s.charAt(j) && s.charAt(i)!=s.charAt(k) && s.charAt(j)!=s.charAt(k) && j-i != k-j)
						res ++ ;
				}
			}
		}
		System.out.println(res);
	}

}
