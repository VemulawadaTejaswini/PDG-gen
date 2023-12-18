import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		String str = sc.next();
		String[] strArray = str.split("");
		Arrays.sort(strArray);
		// System.out.println(Arrays.toString(strArray));
		if(strArray[0].equals(strArray[1]) 
		&& strArray[2].equals(strArray[3])
		&&!strArray[0].equals(strArray[2])){

			System.out.println("Yes");
		}else{

			System.out.println("No");
		}

	}
}
