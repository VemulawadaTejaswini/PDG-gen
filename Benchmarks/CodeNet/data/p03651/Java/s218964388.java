import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		
		long[] input = new long[n];
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			input[i] = Long.parseLong(tmpArray[i]);
		}
		
		
		//互いに素かチェック
		boolean isCoprime = false;
		Arrays.sort(input);
		long[] input2 = Arrays.copyOf(input, input.length);
		
		if(m > input[input.length - 1]){
			System.out.println("IMPOSSIBLE");
			return;
		}
		if(input[0] == 1){
			System.out.println("POSSIBLE");
			return;
		}
		
		int i;
		for(i = 0; i < input2.length ; i++){
//			if(input2[i] == 0){
//				continue;
//			}
//			for(int j = i + 1; j < input2.length ;j++){
				if(input[i]%input[0] != 0){
//				if(input2[j]%input2[i] == 0){
//					input2[j] = 0;;
//					continue;
//				}
//				if(GCD(input2[i], input2[j]) == 1){
					isCoprime = true;
					break;
				}
			}
//			if(isCoprime == true){
//				break;
//			}
////		}
//		
		/*
		//互いに素じゃないなら最大公約数を求める
		if(!isCoprime){
			int x = input[1];
			int y = input[0];
			
			while(x != y)
		}*/
		
		
		
		if(isCoprime){
			System.out.println("POSSIBLE");
		}
		else if( m%input[0] == 0 || input[0]%m == 0){
			System.out.println("POSSIBLE");
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}
	
	static int GCD (int a, int b){
		
		while(a != b){
			//System.out.println(a+" "+b);
			if(b > a){
				int tmp = a;
				a = b;
				b = tmp;
			}
			if(a%b == 0) {
				//System.out.println("result "+b);
				return b;
			}
			a = a%b;
		}
		//System.out.println("result "+a);

		return a;
	}

}
