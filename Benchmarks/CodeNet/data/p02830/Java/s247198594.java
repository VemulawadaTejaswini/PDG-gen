import java.util.Scanner;

class Main {
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);

    	int N = scan.nextInt();
    	String S = scan.next();
    	String T = scan.next();

    	for(int i = 0 ; i < N ; i++) {
    		System.out.print(S.charAt(i) + T.charAt(i));
		}
	}
}
