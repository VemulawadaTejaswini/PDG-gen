
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    int K=gi();
	    String[] sa=new String[K];

	    for(int i=0; i<K;i++) {
        	sa[i]=null;
        }

        for(int i=0; i<S.length();i++) {
        	if(sa[K-1] != null && sa[K-1].compareTo(S.substring(i, i+1)) <= 0)continue;
        	for(int j=i+1; j<=S.length();j++) {
            	String s=S.substring(i, j);
            	for(int k=0;k<K;k++) {
            		String s2=sa[k];
            		if(s.equals(s2))break;
            		if(s2==null || s.compareTo(s2) < 0) {
            			for(int l=K-1;l>k;l--) {
                            sa[l]=sa[l-1];
                    	}
            			sa[k]=s;
            			break;
            		}
            	}
            }
        }

		System.out.println(sa[K-1]);
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

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}