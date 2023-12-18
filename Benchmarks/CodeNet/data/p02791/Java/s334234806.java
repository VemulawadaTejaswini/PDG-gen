import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String line = scanner.nextLine();
		String[] split = line.split(" ");
		List<Integer> intList = new ArrayList<Integer>();

		for(String s : split){
			intList.add(Integer.parseInt(s));
		}
		int cnt = 1;
		for(int i = 1; i < intList.size(); i++){
			Boolean doCount = true;
			for(int j = 0; j < i; j++){
				if(intList.get(j) < intList.get(i)){
					doCount = false;
					break;
				}
			}
			if(doCount)cnt++;
		}
		int result = cnt;
		System.out.println(result);
	}

}
