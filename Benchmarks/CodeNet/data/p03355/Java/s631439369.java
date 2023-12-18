import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    int K=gi();
	    String[] sa=new String[S.length()*(S.length()+1)/2];

	    int ii=0;
        for(int i=0; i<S.length();i++) {
        	for(int j=i+1; j<=S.length();j++) {
            	String s=S.substring(i, j);
            	sa[ii]=s;
            	ii++;
            }
        }
        Arrays.parallelSort(sa);

        int iii=0;
        int q=1;
        String bs=sa[0];
        for(int i=0; i<S.length()*(S.length()+1)/2;i++) {
        	if(q==K)break;
        	String s=sa[i];
        	if(!s.equals(bs)) {
        		iii=i;
        		q++;
        	}
        	bs=s;

        }

		System.out.println(sa[iii]);
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