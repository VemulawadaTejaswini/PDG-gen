import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] N = S.toCharArray();
		boolean n= false;
		for(int i = 0;i < N.length;i++) {
			for(int k = i+1;k < N.length;k++) {
				if(N[i] == N[k])n=true;
			}
		}
		if(n==false)System.out.println("No");
		else System.out.println("Yes");
	}
 
}