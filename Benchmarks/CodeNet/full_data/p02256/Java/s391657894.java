import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main{

	public static void main(String[] args) throws IOException{

		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int[] c_divisor = m.getCommonDivisor(m.getDivisor(x), m.getDivisor(y));

		if(c_divisor.length == 1){
			System.out.println(c_divisor[0]);
		}else{
			System.out.println(m.getMaxCommonDivisor(c_divisor));
		}

	}

	public int[] getDivisor(int num){

		int element = 0;
		int[] divisor = new int[element];

		for(int i = 1; i <= num; i++){

			if(num % i == 0){
				divisor = Arrays.copyOf(divisor, ++element);
				divisor[element - 1] = i;
			}

		}

		return divisor;

	}

	public int[] getCommonDivisor(int[] divisor_1, int[] divisor_2){

		int element = 0;
		int[] common_divisor = new int[element];

		for(int i = 0; i < divisor_1.length; i++){
			for(int j = 0; j < divisor_2.length; j++){

				if(divisor_1[i] == divisor_2[j]){
					common_divisor = Arrays.copyOf(common_divisor, ++element);
					common_divisor[element - 1] = divisor_1[i];
				}

			}
		}

		return common_divisor;

	}

	public int getMaxCommonDivisor(int[] common_divisor){

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < common_divisor.length; i++){
			max = Math.max(max, common_divisor[i]);
		}

		return max;

	}

}