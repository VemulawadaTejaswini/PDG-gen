import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		String[] str = br.readLine().split(" ");
		int[] numList = new int[count];
		for (int i = 0; i < count; i++) {
			numList[i] = Integer.parseInt(str[i]);
		}
		Tool.bubleSort(numList, count);
	}
}

class Tool {
	static void bubleSort(int[] numList, int count) {
		StringBuffer sb = new StringBuffer();
		int flag = 0;
		for (int i = 0; i < count; i++) {
			for (int j = count - 1; j > i; j--) {
				if (numList[j - 1] > numList[j]) {
					int temp = numList[j];
					numList[j] = numList[j - 1];
					numList[j - 1] = temp;
					flag++;
					j = count;
				}
			}
		}
		sb.append(numList[0]);
		for(int i = 1; i < count; i++){
			sb.append(" " + numList[i]);
		}
		System.out.println(sb.toString() + "\n" + flag);
	}
}