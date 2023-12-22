import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		String T = scan.next();
		String[] n = N.split("");
		String[] t = T.split("");
		int c =0;
		
		for(int i=0; i<N.length(); i++) {
			if(n[i].equals(t[i])){
			}else {
				c++;
			}
		}
		System.out.println(c);
	}
}
