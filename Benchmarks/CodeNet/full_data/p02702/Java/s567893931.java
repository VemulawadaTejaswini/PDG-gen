import java.io.FileNotFoundException;
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
//    				String num = S.substring(i, j+1);
//    				BigInteger num2 = new BigInteger(num);
//    				if(num2.mod(BigInteger.valueOf(2019)).equals(BigInteger.valueOf(0))) {
//    					ans ++;
//    					System.out.println(ans);
//    				}
    				//i桁目からj桁目を数字としてみる。
    				int mod = Integer.parseInt(S.substring(j, j+1));
    				int tenMod = 1;
    				for(int k=1;k<=j-i;k++) {
    					tenMod = tenMod*10%2019;
    					mod = (mod + Integer.parseInt(S.substring(j-k,j-k+1))*tenMod)%2019;
    				}
    				if(mod==0) {
    					ans ++;
    				}
    			}
    		}
    		System.out.println(ans);
    	}

    }

}