import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    // 1000の倍数の場合はお釣りは必ず0円となる
	    // 1000の倍数でない場合は、1000-（N円の1の位～百の位）がお釣りとなる
	    int answer = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try{
	        String str = br.readLine();
	        int n = Integer.parseInt(str);

	        if (n % 1000 == 0) {
	            System.out.println(answer);
	        } else {
	            answer = 1000 - (n % 1000);
	            System.out.println(answer);
	        }

	    } catch (IOException ioe) {

	    }
	}

}