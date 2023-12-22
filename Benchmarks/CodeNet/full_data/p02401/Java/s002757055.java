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
			intA = scan.nextInt();
			strCulc = scan.nextLine();
			intB = scan.nextInt();
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

		scan.close();
	}
}