import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String line = scanner.nextLine();
		String[] splits = line.split(" ");
		int[] a = new int[splits.length];
		Boolean isOK = true;
		for(int i = 0; i < splits.length; i++){
			a[i] = Integer.parseInt(splits[i]);
			if(a[i] % 2 == 0 && (a[i]%3 != 0 && a[i] % 5 != 0)){
				isOK = false;
				break;
			}else{

			}
		}
		String result = isOK ? "APPROVED" : "DENIED";

		System.out.println(result);
	}

}
