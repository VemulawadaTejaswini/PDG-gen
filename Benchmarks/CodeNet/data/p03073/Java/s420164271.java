import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String[] strArray = s.split("");

		int countOne = 0;
		int countTwo = 0;

		for (int i = 0; i < strArray.length; i++) {
			String curS = strArray[i];

			if(i!=0 && i%2==1){
				if(curS.equals("0")){
					countOne++;
				}else{
					countTwo++;
				}
			}else{
				if(curS.equals("1")){
					countOne++;
				}else{
					countTwo++;
				}
			}

		}

		System.out.println(Math.min(countOne,countTwo));

	}
}
