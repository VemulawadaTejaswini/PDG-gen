import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Debt = 100000;
		Debt= ratecal(N,Debt);
		System.out.println(Debt);
	}

	public static int ratecal(int N, int Debt ){
		
		while(N > 0){
			Debt = (int)(Debt * 1.05);
			if(Debt % 1000 > 0 ){
				Debt = ((Debt/1000) + 1) * 1000;
			}
			else {
				Debt = (Debt/1000) * 1000;
			}
			N--;
		}
		
		return Debt;
	}
}