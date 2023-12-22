

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			int input[] = new int[n];

			String[] tmpArray = br.readLine().split(" ");
			for(int i = 0; i < n; i++){
				input[i] = Integer.parseInt(tmpArray[i]);
			}

			int ansS = 0, ansA = 0, ansC = 0;
			double result = Double.MAX_VALUE;
			//全探索
			for(int s = 0; s <= 15; s++){
				for(int a = 0; a <= 15; a++){
					for(int c = 0; c <= 15; c++){
						double tmpEntropy = calcEntropy(generateOutput(input, s, a, c));

//						if(s == 8){
//							System.out.println("s a c"+ s+" "+ a+" " + c + " entropy "+tmpEntropy);
//						}
						if(tmpEntropy < result){
							result = tmpEntropy;
							ansS = s; ansA = a; ansC = c;
						}
					}
				}
			}

			System.out.println(ansS + " "+ ansA +" "+ ansC);
		}
	}

	static int[] generateOutput(int[] input, int s, int a, int c){

		int n = input.length;

		int[] r = new int[n + 1];
		r[0] = s;
		for(int i = 1; i <= n; i++){
			r[i] = (a*r[i - 1] + c) % 256;
		}

		int[] out = new int[n];

		for(int i = 0; i < n; i++){
			out[i] = (input[i] + r[i + 1]) % 256;
		}

		return out;
	}

	static double calcEntropy(int[] array){
		int[] count = new int[256];
		int n = array.length;

		for(int i = 0; i < n; i++){
			count[array[i]]++;
		}

		double result = 0;

		for(int i = 0; i < count.length; i++){
			if(count[i] != 0){
//				System.out.println(i+" appears "+count[i]+" times");
				result += (double)count[i]/n * Math.log((double)count[i]/n)/Math.log(2);
			}
		}

		//System.out.println("entropy "+(-result));
		return -result;
	}

}

