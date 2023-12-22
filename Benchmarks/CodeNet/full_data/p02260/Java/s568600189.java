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
		Tool.selectionSort(numList, count);
	}
}

class Tool {
	static void selectionSort(int[] numList, int count) {
		StringBuffer sb = new StringBuffer();
		int flag = 0;
//????????¨????¨???°
		for(int i = 0; i < count - 1; i++){
			int minj = i;
			for(int j = i + 1; j < count; j++){
				if(numList[j] < numList[minj]){//?????§??????????´¢??????
					minj = j;
				}
			}
				if(minj != i){//???????????????
					int temp = numList[i];
					numList[i] = numList[minj];
					numList[minj] = temp;
					flag++;
				}
			}
		sb.append(numList[0]);
		for (int i = 1; i < count; i++) {
			sb.append(" " + numList[i]);
		}
		System.out.println(sb.toString() + "\n" + flag);
	}
}