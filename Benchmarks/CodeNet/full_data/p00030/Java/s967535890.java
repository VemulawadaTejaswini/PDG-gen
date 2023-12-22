import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		while(true){
			String[] input = br.readLine().split(".");
			int numNumbers = Integer.parseInt(input[0]);
			int sum = Integer.parseInt(input[1]);
			if(numNumbers == 0 && sum == 0)	break;
			int numCombinations = 0;
			for(int base = 0; base <= 9; base++){
				numCombinations += getCombinations(base, numNumbers, sum);
			}
			System.out.println(numCombinations);
		}
	}
	/**
	 * 組み合わせの数を求める
	 * @param base			組み合わせで用いる最小値
	 * @param numNumbers	組み合わせに用いる数の個数
	 * @param sum			対象となる和
	 * @return	sumとなる組み合わせの数
	 */
	public static int getCombinations(int base,int numNumbers, int sum){
		int c = 0;
		if(sum < 0 || base > 9)	return 0;
		if(numNumbers == 1 && sum == 0)	return 1;
		for(int i = 1; i <= 9; i++)
			c += getCombinations(base + i, numNumbers - 1, sum - base - i);
		return c;
	}
}