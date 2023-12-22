import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		@SuppressWarnings("unchecked")
		Stack<Integer>[] stackArray = new Stack[n];
		for(int i = 0; i < n; i++){
			stackArray[i] = new Stack<Integer>();
		}

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			//push
			if(tmpArray[0].equals("0")){
				int t = Integer.parseInt(tmpArray[1]);
				int x = Integer.parseInt(tmpArray[2]);

				stackArray[t].push(x);
			}
			//top
			else if(tmpArray[0].equals("1")){
				int t = Integer.parseInt(tmpArray[1]);

				if(!stackArray[t].isEmpty()){
					System.out.println(stackArray[t].peek());
				}
			}
			//pop
			else {
				int t = Integer.parseInt(tmpArray[1]);

				if(!stackArray[t].isEmpty()){
					stackArray[t].pop();
				}
			}
		}

	}
}

