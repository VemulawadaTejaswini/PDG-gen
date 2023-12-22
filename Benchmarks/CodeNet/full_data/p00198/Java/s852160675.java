import java.util.*;

public class Main{
	String name = "CYRMGB";
	
	//サイコロ	//dice is, 1 = south, 2 = east, 0 = top, 5 = bottom, 3 = west, 4 = north;
	class Dice{
		StringBuilder dice;
		public Dice(String dice) {
			this.dice = new StringBuilder(dice);
		}
		private void slide() {
			swap(1,3,4,2);
		}
		private void turn(char c) {
			switch(c){
			case 'n': swap(0,4,5,1); break;
			case 's': swap(0,1,5,4); break;
			case 'w': swap(0,3,5,2); break;
			case 'e': swap(0,2,5,3); break;
			}
		}
		private void swap(int i, int j, int k, int l) {
			char temp = dice.charAt(l);
			dice.setCharAt(l, dice.charAt(k));
			dice.setCharAt(k, dice.charAt(j));
			dice.setCharAt(j, dice.charAt(i));
			dice.setCharAt(i, temp);
		}
	}
	
	//サイコロが同じかどうか判定する
	private boolean isSame(Dice aa, Dice bb) {
		String [] order = {"", "n", "s", "w", "e", "nn"};
		String [] revorder = {"", "s", "n", "e", "w", "nn"};
		Dice a = new Dice(aa.dice.toString());
		Dice b = new Dice(bb.dice.toString());
		for(int i = 0; i < order.length ; i++){
			for(int j = 0; j < order[i].length(); j++){
				char c = order[i].charAt(j);
				b.turn(c);
			}
			for(int j = 0; j < 4; j++){
				b.slide();
				if(a.dice.toString().equals(b.dice.toString())){
					
					return true;
				}
			}
			for(int j = 0; j < revorder[i].length(); j++){
				char c = revorder[i].charAt(j);
				b.turn(c);
			}
		}
		return false;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Dice [] d = new Dice[n];
			for(int i = 0; i < n; i++){
				StringBuilder tempdice = new StringBuilder();
				for(int j = 1; j <= 6; j++){
					String s = sc.next().charAt(0) + "";
					tempdice.append(name.indexOf(s));
				}
				d[i] = new Dice(tempdice.toString());
			}
			
			int count = 0;
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					if(isSame(d[i], d[j])){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}