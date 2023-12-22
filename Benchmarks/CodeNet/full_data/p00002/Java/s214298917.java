import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) {
		 InputStreamReader is = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(is);

	        System.out.println("何か入力してください.");
	        String str="";

	        try {
		        str = br.readLine();
	        }catch (Exception e) {
				// TODO: handle exception
			}

	        String moji[] = str.split(" ");
	        int sum = Integer.parseInt(moji[0]) + Integer.parseInt(moji[1]);

	        int length = 1;
	        while(sum > 9){
	        	sum/=10;
	        	length++;
	        }
	        System.out.println(length);
	}
}