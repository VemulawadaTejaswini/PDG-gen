import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		String tempList = scanner.nextLine();
		String[] list = new String[Integer.parseInt(n)];
		int result = 0;

		//リストへのRGBの挿入
		for(int i = 0; i < Integer.parseInt(n); i++) {
			list[i] = String.valueOf(tempList.charAt(i));
		}

		//JUDGEMENT
		for(int i = 0; i < Integer.parseInt(n) - 2; i++) {
				for(int j = i + 1; j < Integer.parseInt(n) - 1; j++){
					if(!list[j].equals(list[i])) {
						for(int k = j + 1; k < Integer.parseInt(n); k++){
							if(!list[k].equals(list[j]) && !list[k].equals(list[i])) {
								if( j - i != k - j) {
									result++;
								}
							}
						}

					}
				}

			}
		System.out.println(result);
	}
}
