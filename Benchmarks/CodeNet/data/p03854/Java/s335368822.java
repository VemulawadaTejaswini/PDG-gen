import java.util.*;

public class Main {

	public static void main(String[] args) {


		String[] stringList = { "dreamer", "dream",  "eraser","erase" };

		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();

		for(int i = 0; i < stringList.length; i++) {
			S = S.replace(stringList[i], "");
		}

		if(S.equals("")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}