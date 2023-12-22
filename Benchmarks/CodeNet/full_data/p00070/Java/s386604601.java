import java.util.Scanner;

class Main {
	private static int terminal = 0;
	private static int numConsist = 0;
	private static int integerArray[] = {0,1,2,3,4,5,6,7,8,9};

	public void nextFor(int iteration, int iIntegerArray, int constant, int sum){
		int tmpSum;
		int tmpIArray = iIntegerArray;
		for( int i = iIntegerArray; i <integerArray.length; i++){
			tmpSum = new Integer(sum);
			tmpSum += integerArray[i] * (constant + 1);
			tmpIArray++;
			if(tmpSum > terminal){
				i = integerArray.length;
			} else {
				if (tmpIArray <= 9 && iteration > 1)
					nextFor(iteration -1, tmpIArray, constant + 1, tmpSum);
				if((iteration == 1 && tmpSum == terminal) || (tmpIArray == 10 && tmpSum == terminal)){
					numConsist++;
				}
			}
		}
	}

	public static void main(String[] args){

		Main cNS = new Main();

		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int iteration = input.nextInt();
			terminal = input.nextInt();

			if(iteration >= 1 && iteration <=10 && terminal >= 0 && terminal <= 330){
				numConsist = 0;
				cNS.nextFor(iteration, 0, 0, 0);
				System.out.println(numConsist);
			} else if(iteration >= 1 && iteration <=10 && terminal > 330 && terminal <= 10000){
				System.out.println(0);
			}

		}
		input.close();
	}
}