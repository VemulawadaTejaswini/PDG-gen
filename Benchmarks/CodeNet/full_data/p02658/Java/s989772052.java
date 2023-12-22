import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();

    	long[] A = new long[N];

    	long times = 1;
    	long K = (long) Math.pow(10,18);

    	boolean flg = true;
    	boolean haszero = false;

    	for(int i=0;i<N;i++) {
    		A[i]=sc.nextLong();
    	}

    	for(int i=0;i<N;i++) {
    		if(A[i]==0) {
    			haszero = true;
    			break;
    		}
    	}

    	if(haszero==false) {

        	for(int i=0;i<N;i++) {
        		times = times * A[i];

        		if(times>K) {
        			flg = false;
        			break;
        		}
        	}

        	if(flg) {
        		System.out.println(times);
        	} else {
        		System.out.println("-1");
        	}

    	} else {
    		System.out.println("0");
    	}
    }
}