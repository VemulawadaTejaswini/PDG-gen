import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?

		Scanner sc = new Scanner(System.in);
		InputData[] id = new InputData[9];
		
		for(int i = 0; i < 9; i++) {
			String name = sc.next();
			int am = sc.nextInt();
			int pm = sc.nextInt();
			
			id[i] = new InputData(name, am, pm);
		}
		
		for(int i = 0; i < 9; i++) {
			int sum = id[i].am + id[i].pm;
			int income = id[i].am * 200 + id[i].pm * 300;
			
			System.out.println(id[i].name + " " + sum + " " + income);
		}
		
	}

}

class InputData{
	
	String name;
	int am;
	int pm;
	
	public InputData(String n, int a, int p){
		this.name = n;
		this.am = a;
		this.pm = p;
	}
	
	
	
}