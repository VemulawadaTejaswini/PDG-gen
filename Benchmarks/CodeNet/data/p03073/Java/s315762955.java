import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S= gs();
	    
	    int ckz= 0;
	    int cgz=0;
        for (int i=0; i<S.length(); i++) {
        	char c=S.charAt(i);
        	if (c=='0' && i%2==0) {
                ckz++;
        	} else if (c=='1' && i%2==1) {
        		ckz++;
        	}
        	
        	if (c=='0' && i%2==1) {
                cgz++;
        	} else if (c=='1' && i%2==0) {
        		cgz++;
        	}
        }


        System.out.print(Math.min(cgz, ckz));
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}
}