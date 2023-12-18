import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		String tempList = scanner.nextLine();
		String[] list = new String[Integer.parseInt(n)];
		String[] temp = new String[2];
		int result = 0;

		//リストへのRGBの挿入
		for(int i = 0; i < Integer.parseInt(n); i++) {
			list[i] = String.valueOf(tempList.charAt(i));
		}

		//JUDGEMENT
		for(int i = 0; i < Integer.parseInt(n) - 2; i++) {
			temp[0] = list[i];
		
				for(int j = i + 1; j < Integer.parseInt(n) - 1; j++){

					if(!list[j].equals(temp[0])) {
						temp[1] = list[j];
		
						for(int k = j + 1; k < Integer.parseInt(n); k++){

							if(!list[k].equals(temp[0]) && !list[k].equals(temp[1])) {
		
								if( j - i != k - j) {
									result++;
								}
							}
						}
					temp[1] = null;
					}

				}
			temp[0] = null;
			}
		System.out.println(result);
	}
}
