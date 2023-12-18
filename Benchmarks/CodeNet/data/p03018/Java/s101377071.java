import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] strArray = str.split("");

		int count =0;

		if(strArray.length<3){
			System.out.println(count);
			return;
		}
		boolean isContinue =true;

		while(isContinue){
			int currentCount = count;
			for(int i=1;i<strArray.length-1;i++){
				String curAbc = strArray[i-1] + strArray[i] + strArray[i+1];
				if(curAbc.equals("ABC")){
					count++;
					strArray[i-1] = "B";
					strArray[i] = "C";
					strArray[i+1] = "A";
				}
			}
			for(int i = strArray.length-2 ; i >= 1; i--){
				String curAbc = strArray[i-1] + strArray[i] + strArray[i+1];
				if(curAbc.equals("ABC")){
					count++;
					strArray[i-1] = "B";
					strArray[i] = "C";
					// strArray[i+1] = "A";
				}
			}

			if(currentCount == count){
				isContinue =false;
			}
		}


		System.out.println(count);

	}

}
