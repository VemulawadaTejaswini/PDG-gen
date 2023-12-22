import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	String S = sc.next();

    	char[] s = S.toCharArray();

    	int size = s.length;
    	int ans = 0;
    	if(size<=3) {
    		System.out.println(ans);
    	} else {
    		for (int i=0;i<=size-4;i++) {
    			for (int j=i+3;j<=size-1;j++) {
    				String num = "";
    				for(int k=i;k<=j;k++) {
    					num += s[k];
    				}
    				BigInteger num2 = new BigInteger(num);
    				if(num2.mod(BigInteger.valueOf(2019)).equals(BigInteger.valueOf(0))) {
    					ans ++;
    				}
    			}
    		}
    		System.out.println(ans);
    	}

    }

}