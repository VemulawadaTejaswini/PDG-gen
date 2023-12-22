import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(sc.hasNext()){
			String hu = sc.nextLine();
			String[] stra = hu.split(",");
			double bmi = Double.parseDouble(stra[1]) / Math.pow(Double.parseDouble(stra[2]),2);
			if (bmi >= 25) list.add(Integer.parseInt(stra[0]));
				for(int i = 0 ; i < list.size() ; i++){
					System.out.println(list.get(i));
				}
		}
		sc.close();
	}

}