import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int ans = 0;
    	for(int i=1;i<=N;i++) {
    		int x = sc.nextInt();
    		if(i%2==1) {
    			if(x%2==1) {
    				ans++;
    			}
    		}
    	}
    	System.out.println(ans);

    }
}
