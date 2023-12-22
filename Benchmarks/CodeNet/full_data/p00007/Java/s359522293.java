import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//??????10??????
		int debt = 100000;

		//n??±???
		int n = scanner.nextInt();

		for(int i=0; i<n; i++){
			debt *= 1.05;
			debt = roundOff(debt);
		}
		System.out.println(debt);
	}

	public static int roundOff(int debt){
		String strDebt = String.valueOf(debt);
		int splitDebt = Integer.parseInt(strDebt.substring(strDebt.length()-3));

		if(0<splitDebt){
			//debt = (105000 + 10000) - 5000
			debt = (debt+1000) - splitDebt;
		}
		return debt;
	}

}