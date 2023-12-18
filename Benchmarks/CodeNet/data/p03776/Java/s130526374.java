

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int MIN = sc.nextInt();
		int MAX = sc.nextInt();

		BigInteger[][] combo_table = new BigInteger[N+1][N+1];
		setConbTable(combo_table);

		BigInteger[] values = new BigInteger[N];


		for(int i = 0;i < N;i++){
			values[i] = sc.nextBigInteger();
		}

		Arrays.sort(values, new Comparator<BigInteger>() {
			public int compare(BigInteger x,BigInteger y){
				return Integer.valueOf(y.subtract(x).toString());
			}
		});

		BigInteger sum = BigInteger.ZERO;

		for(int i = 0;i < MIN;i++){
			sum = sum.add(values[i]);
		}

		System.out.println(String.format("%f", sum.doubleValue() / MIN));
		BigInteger pattern_count = BigInteger.ZERO;

		if(values[0].equals(values[MIN - 1])){
			int min_value_count = MIN;
			for(int i = MIN;i < MAX;i++){
				if(!values[0].equals(values[i]))break;
				min_value_count++;
			}

			for(int i = MIN;i <= MAX;i++){
//				System.out.println("min : " + min_value_count + ", i : " + i);
				if(!values[i - 1].equals(values[0]))break;
				pattern_count = pattern_count.add(combo_table[min_value_count][i]);
			}
		}else{
			int min_value_count = 0;
			int inner_count = 0;
			for(int i = MIN - 1;0 <= i;i--){
				if(!values[MIN - 1].equals(values[i]))break;
				min_value_count++;
				inner_count++;
			}

			for(int i = MIN; i < N;i++){
				if(!values[MIN - 1].equals(values[i]))break;
				min_value_count++;
			}
			pattern_count = pattern_count.add(combo_table[min_value_count][inner_count]);
		}
		System.out.println(pattern_count);

		sc.close();
	}


	static BigInteger factrial(BigInteger num){
		if(num.compareTo(BigInteger.ONE) < 0)return BigInteger.ONE;

		return num.multiply(factrial(num.subtract(BigInteger.ONE)));
	}

	static void setConbTable(BigInteger[][]table){
		for(int i = 0;i < table.length;i++){
			for(int j = 0;j <= i; j++){
				if(j == 0 || j == i){
					table[i][j] = BigInteger.ONE;
				}else{
					table[i][j] = table[i-1][j-1].add(table[i-1][j]);
				}
			}
		}
	}
}
