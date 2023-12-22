import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
    	if(K%2==0||K%5==0) {
    		System.out.println(-1);
    	} else {
//    		BigInteger a = BigInteger.valueOf(K);
//    		BigInteger b = BigInteger.valueOf(K);
//    		boolean flg = true;
//    		String S = "";
//    		while(flg==true) {
//    			a =a.add(b);
//    			S = a.toString();
//    			if(S.matches("7*")) {
//    				flg = false;
//    			}
//    		}

    		boolean flg = true;
    		String seven = "7";
    		String x = "";
    		int count = 0;
    		while(flg==true) {
    			x = x+seven;
    			count++;
    			BigInteger X = new BigInteger(x);
    			BigInteger Y = BigInteger.valueOf(K);
    			if(X.remainder(Y)==BigInteger.valueOf(0)) {
    				flg = false;
    			}
    		}

    		System.out.println(count);
    	}
    }

}
