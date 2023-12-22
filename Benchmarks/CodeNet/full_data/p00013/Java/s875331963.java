import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] a){

		Stack<Integer> arr = new Stack<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		try {
			while(null != (tmpString = bf.readLine())){
				if(tmpString.equals("0")){
					System.out.println(arr.pop());
				} else {
					arr.push(Integer.parseInt(tmpString));
				}
			}
		} catch (IOException e) {
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}

	}

}