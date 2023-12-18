import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A= new int[N];

        for (int i=0; i<N; i++) {
        	A[i]=gi();
        }

        long max=0;
        int index=0;
        for (int i=0; i<N; i++) {
            if (A[i]>max) {
            	max=A[i];
            	index=i;
            }
        }
        
        for (int i=0; i<N; i++) {
            if (A[i]>max) {
            	max=A[i];
            }
        }

        for (int i=0; i<N; i++) {
            if (i==index) {
            	long max2=0;
                for (int j=0; j<N; j++) {
                    if (j!=index && max2<A[j]) {
                    	max2=A[j];
                    }
                }
                System.out.println(max2);
            } else {
            	System.out.println(max);
            }
        }

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