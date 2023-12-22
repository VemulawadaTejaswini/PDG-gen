import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
			int n = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < n; i++){
				calc(sc.nextLine());
			}
	}
	
	public void calc(String line){
		String[] button1 = {".",",","!","?"," "};
		String[] button2 = {"a","b","c"};
		String[] button3 = {"d","e","f"};
		String[] button4 = {"g","h","i"};
		String[] button5 = {"j","k","l"};
		String[] button6 = {"m","n","o"};
		String[] button7 = {"p","q","r","s"};
		String[] button8 = {"t", "u", "v"};
		String[] button9 = {"w","x","y","z"};
		
		String[] input = line.split("0");
		String ans = "";
		for(int i = 0; i < input.length; i++){
			if(input[i].length() > 0){
				String[] button = null;
				if(input[i].charAt(0) == '1') button = button1;
				else if(input[i].charAt(0) == '2') button = button2;
				else if(input[i].charAt(0) == '3') button = button3;
				else if(input[i].charAt(0) == '4') button = button4;
				else if(input[i].charAt(0) == '5') button = button5;
				else if(input[i].charAt(0) == '6') button = button6;
				else if(input[i].charAt(0) == '7') button = button7;
				else if(input[i].charAt(0) == '8') button = button8;
				else if(input[i].charAt(0) == '9') button = button9;
				int num = getNum(input[i].length(), button.length);
				ans = ans + button[num];
			}
		}
		System.out.println(ans);
	}
	public int getNum(int lineleng, int buttonNum){
		if(lineleng > buttonNum){
			return getNum(lineleng-buttonNum, buttonNum);
		}
		else return lineleng-1;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}