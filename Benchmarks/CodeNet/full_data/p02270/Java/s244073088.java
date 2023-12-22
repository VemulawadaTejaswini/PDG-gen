import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int weight;
		int loadNum = scanner.nextInt();
		int carNum = scanner.nextInt();
		int[] loadList = new int[loadNum];
		int[] track = new int[carNum];

		// ??????????????????????´? ?????????????????????????????????????????????????±???????
		int sumWeight = 0;
		for (int i = 0; i < loadNum; i++) {
			loadList[i] = scanner.nextInt();
			sumWeight = sumWeight + loadList[i];
		}
		weight = sumWeight / carNum;
		if(sumWeight % carNum != 0){
			weight =  weight + 1;
		}
		
		

		reStart: {
			int count = 0;
			for (int i = 0; i < carNum; i++) {
				for (int j = count; j < loadNum; j++) {
					if (track[i] + loadList[j] <= weight) {
						track[i] += loadList[j];
					} 
					if (i == carNum && j <= loadNum) {
							int temp = 0;
							int k = 0;
							do {
								temp += loadList[k];
								k++;
							} while (sumWeight < temp);
							weight = temp;
							break reStart;
						}
						count = j;
					}
					break;
				}
			System.out.println(weight);
		}
	}
}