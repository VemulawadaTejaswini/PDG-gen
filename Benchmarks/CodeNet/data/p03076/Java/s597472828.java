import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> listInteger = new ArrayList();
		int biggestNumber = 99;
		for(int i = 0;i<5;i++) {
			int tmp = Integer.parseInt(sc.nextLine());
			int intTmp = tmp%10;
			if(intTmp != 0 && biggestNumber >= intTmp) {
				biggestNumber = intTmp;
			}
			listInteger.add(tmp);
		}
		
		int result = 0;
		boolean flag = true;
		for(int i = 0;i<listInteger.size();i++) {
			int compInt = listInteger.get(i)%10;
			if(biggestNumber == compInt && flag) {
				result += listInteger.get(i);
			}else {
				result += listInteger.get(i)%10 > 0 ? listInteger.get(i)/10*10+10 : listInteger.get(i)/10*10;
			}
		}
		
		System.out.println(result);
		
		
	}
}
	
	