import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int NUM = 4;
	static int[][] numPatterns = new int[24][NUM];
	static int count = 0;
	static int answerIndex = -1;
	static char[] answerOpe = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if(line.equals("0 0 0 0")) break;
			
			String[] splited = line.trim().split(" ");

			int[] num = new int[NUM];
			for (int i = 0; i < NUM; i++) {
				num[i] = Integer.parseInt(splited[i]);
			}

			// 数値の組み合わせ
			numCombination(num, 0);
			//演算子の組み合わせ
			String answer = "0";
			for(int i = 0; i < 24; i++) {
				
				char[] ope = new char[NUM];
				opeCombination(i, 1, numPatterns[i][0], ope);
				
				if(answerIndex != -1) {
					answer = makeResult();
					break;
				}
			}
			
			System.out.println(answer);
			count = 0;
			answerIndex = -1;
			answerOpe = null;
		}
	}

	private static String makeResult() {
		String data = new String(Integer.toString(numPatterns[answerIndex][0]));
		if(answerOpe[0] == 'A') {
			data = String.format("(%d * %d) %c (%d * %d)", numPatterns[answerIndex][0],
					numPatterns[answerIndex][1],
					answerOpe[2],
					numPatterns[answerIndex][2],
					numPatterns[answerIndex][3]);
			return data;
		}
		for(int i = 1; i < NUM; i++) {
			if(answerOpe[i] == '*') {
				data = data + " " +answerOpe[i] + " " + numPatterns[answerIndex][i];
			} else {
				data = "(" + data + " " +answerOpe[i] + " " + numPatterns[answerIndex][i] + ")";
			}
		}
		return data;
	}


	private static void opeCombination(int pi, int index, int sum, char[] ope) {
		if(index > 3 || answerIndex != -1) {
			if(sum == 10) {
				answerIndex = pi;
				answerOpe = ope.clone();
			}
			return;
		}
		if(index == 1) {
			//(A * B) + or - (C * D) 
			ope[3] = '*';
			ope[1] = '*';
			
			ope[2] = '+';
			opeCombination(pi, 4, sum * numPatterns[pi][1] + numPatterns[pi][2] * numPatterns[pi][3], ope);
			ope[2] = '-';
			opeCombination(pi, 4, sum * numPatterns[pi][1] - numPatterns[pi][2] * numPatterns[pi][3], ope);
			
			//(A * B - C) * D　との区別
			if(answerIndex != -1)ope[0] = 'A';
		}
		ope[index] = '+';
		opeCombination(pi, index + 1, sum + numPatterns[pi][index], ope);
		ope[index] = '-';
		opeCombination(pi, index + 1, sum - numPatterns[pi][index], ope);
		ope[index] = '*';
		opeCombination(pi, index + 1, sum * numPatterns[pi][index], ope);
	}

	/*
	 * 数の組み合わせ一覧を作成する
	 * @param  num2 組み合わせる数値
	 * @param  length 組み合わせる箇所 
	 */
	private static void numCombination(int[] num2, int length) {
		int[] copy = num2.clone();
		if (length + 1 == NUM) {
			numPatterns[count] = copy;
			count++;
			return;
		}
		for (int i = length; i < NUM; i++) {
			if (i != length) {
				copy[length] ^= copy[i];
				copy[i] ^= copy[length];
				copy[length] ^= copy[i];
			}
			if (length + 1 < NUM)
				numCombination(copy, length + 1);
		}
	}
}