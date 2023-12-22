import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			int left = Integer.parseInt(tmp);
			
			int[] weigh = {1,2,4,8,16,32,64,128,256,512};
			
			Stack<Integer> stack = new Stack();
			int i = weigh.length - 1;
			while (left > 0){
				if(left >= weigh[i]){
					stack.push(weigh[i]);
					left -= weigh[i];
				}
				
				i--;
			}
			
			int num = stack.size();
			for(int j = 0; j < num; j++){
				if(j == 0){
					System.out.print(stack.pop());
				}
				else {
					System.out.print(" "+stack.pop());
				}
			}
			System.out.println();
		}
	}

}