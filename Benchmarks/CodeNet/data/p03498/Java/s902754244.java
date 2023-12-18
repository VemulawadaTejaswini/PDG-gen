import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = br.readLine().split(" ");
		
		int input[] = new int[n];
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		int times = 0;
		
		ArrayList<Operation> op = new ArrayList<Operation>();
		while(true){
			//単調増加チェック
			boolean nonDec = true;
			
			int decIndex = -1;
			for(int i = 1; i < n; i++){
				if(input[i-1] > input[i]){
					nonDec = false;
					decIndex = i;
					break;
				}
			}
			if(nonDec){
				break;
			}
			
			//下がり幅チェック
			int dec = input[decIndex - 1] - input[decIndex];
			
			if(input[decIndex - 1] > 0){
				input[decIndex] += input[decIndex - 1];
				op.add(new Operation(decIndex, decIndex + 1));
			}
			//こちらはinput[decIndex]も負
			else {
				for(int i = 0; i < decIndex; i++){
					if(input[i] > input[decIndex]){
						input[i] += input[decIndex];
						op.add(new Operation(decIndex + 1, i + 1));
						break;
					}
				}
			}
			
			times++;
			
		}
//		for(int i = 1; i < n; i++){
//			if(input[i] >= input[i - 1]){
//				continue;
//			}
//			
//			//i番目が負で
//		}
		
		System.out.println(times);
		for(int i = 0; i < op.size(); i++){
			System.out.println(op.get(i).toString());
		}
	}

}

class Operation {
	int x;
	int y;
	
	public Operation (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return x+" "+y;
	}
}
