import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;//push poll peek
import java.util.ArrayDeque;
import java.util.Queue;//add poll peek
import java.util.ArrayDeque;
import java.math.BigDecimal;

class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int a = Integer.parseInt(input[1]);
		int b = Integer.parseInt(input[2]);

		if(a - b >= 0){
			System.out.println("delicious");
		}else if (b - a <= x){
			System.out.println("sefe");			 
		}else{
			System.out.println("dangerous");
		}
	}
}
