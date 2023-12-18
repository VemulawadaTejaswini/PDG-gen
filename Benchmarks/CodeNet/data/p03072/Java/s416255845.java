import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Great_ocen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int lookAble = 1;
		String str = sc.nextLine();
		List<Integer> array = new ArrayList<Integer>();

		for(int i = 0;i < num; i++) {
			array.add(Integer.valueOf(str.charAt(i)));
		}

		for(int j = 1; j < array.size();j++) {
			if(array.get(j) < array.get(j +1 )) {
				lookAble += 1;
			}
		}

		System.out.println(lookAble);

	}
}