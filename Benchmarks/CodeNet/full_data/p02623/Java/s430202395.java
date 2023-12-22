import java.util.Scanner;

public class Main {

	static int[] A;
	static int[] B;
	static boolean flg=false;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int M=Integer.parseInt(scanner.next());
	    long K=Long.parseLong(scanner.next());
	    A=new int[N];
	    B=new int[M];
	    int ca=0;
	    int cb=0;
	    long tmp=0;
	    for (int i = 0; i<N; i++) {
	        A[i] =Integer.parseInt(scanner.next());
	        if (K>=tmp+A[i]) {
	        	tmp+=A[i];
	        	ca++;
	        }
	    }
	    for (int i = 0; i<M; i++) {
	        B[i] =Integer.parseInt(scanner.next());
	        if (K>=tmp+B[i]) {
	        	tmp+=B[i];
	        	cb++;
	        }
	    }

	    long cm = ca+cb;
	    int ca2=ca;
	    int cb2=cb;
	    for (int i=1; i<=ca;i++) {
	    	ca2--;
	    	tmp-=A[ca-i];
	    	while(cb2 <M) {
	    		if (tmp + B[cb2] < K) {

	    			tmp+=B[cb2];
	    			cb2++;
	    		} else {
	    			break;
	    		}
	    	}
	    	if (cm<ca2+cb2) {
	    		cm=ca2+cb2;
	    	}
	    	if(cb2==M) {
	    		break;
	    	}
	    }

	    System.out.println(cm);
	}
}