import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main{
	static ArrayDeque<Integer> list = new ArrayDeque<Integer>();
	static int weight[] = {1,2,4,8,16,32,64,128,256,512};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while(null != (str=br.readLine())){
			int n = Integer.parseInt(str);
			weightCount(n);
			OutPut();
		}
	}

	static void weightCount(int n){
		for(int i=weight.length-1; 0<=i || 0<n; i--){
			if(n>=weight[i]){
				n -= weight[i];
				list.push(weight[i]);
			}
		}
	}

	static void OutPut(){
		for(int i=list.size(); i>0 && !list.isEmpty(); i--){
			if(i != 1){
				System.out.print(list.pop() + " ");
			}else{
				System.out.println(list.pop());
			}
		}
	}

}