import java.util.Scanner;

class Main {
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);

    	int N = scan.nextInt();
    	String S = scan.next();
    	String T = scan.next();

    	for(int i = 0 ; i < N ; i++) {
			String s = S.substring(i,i+1);
			String t = T.substring(i,i+1);
    		System.out.print(s+t);
		}
    	System.out.println();
	}
}
