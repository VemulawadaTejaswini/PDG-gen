
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] A=new int[200001];

	    int k=0;
	    for(int i=0; i<N;i++) {
	    	int ind=gi();
	    	if (A[ind]==0)k++;
	    	A[ind]++;
	    }

	    Arrays.parallelSort(A);

	    int i=0;
	    int a=0;
	    while(k>K) {
	    	if(A[i]==0) {
	    		i++;
	    		continue;
	    	}
	    	a+=A[i];
	    	i++;
	    	k--;

	    }
	    System.out.print(a);
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