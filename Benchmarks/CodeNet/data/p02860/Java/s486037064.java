import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	String S = sc.next();
    	sc.close();

    	if(N%2!=0) {
    		System.out.println("No");
    	} else {
    		char[] s = S.toCharArray();
    		boolean flg = true;
    		for(int i=0;i<S.length()/2;i++) {
    			if(s[i]!=s[i+S.length()/2]) {
    				flg = false;
    			}
    		}
    		if(flg) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}
    	}


    }
}