public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int length = reader.nextInt();
		reader.nextLine();
		String list = reader.nextLine();
		int[] intList = new int[length];
		int k = 0;
		for(int i = 0; i < list.length(); i++) {
			if(!list.substring(i, i+1).equals(" ")){
				intList[k] = Integer.parseInt(list.substring(i, i + 1));
				k++;
			}
		}
		for(int i = 1; i < intList.length; i++) {
			for(int m = 0; m < intList.length; m++) {
				System.out.print(intList[m] + " ");
			}
			System.out.println("");
			int key = intList[i];
			int j = i - 1;
			while(j >= 0 && intList[j] > key) {
				intList[j+1] = intList[j];
				j--;
			}
			intList[j+1] = key;
		}
	}
}
