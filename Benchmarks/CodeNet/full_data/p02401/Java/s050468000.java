import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int intA = scan.nextInt();
		String strCulc = scan.nextLine();
		int intB = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!"?".equals(strCulc)){
			if("+".equals(strCulc)){
				list.add(intA + intB);
			}else if("-".equals(strCulc)){
				list.add(intA - intB);
			}else if("*".equals(strCulc)){
				list.add(intA * intB);
			}else if("/".equals(strCulc)){
				list.add(intA / intB);
			}
		}

		scan.close();
	}
}