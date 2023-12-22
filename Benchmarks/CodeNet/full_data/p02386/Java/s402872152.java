import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dice[] dice = new Dice[n];
		
		for(int i = 0; i < n; i++) {
			dice[i] = new Dice(sc);
		}
		
		boolean a = false;
		
		for(int i1 = 0; i1 < n; i1++) {
			for(int i2 = 0; i2 < n; i2++) {
				if(i1 != i2) {
					a = a || (Dice.rollCheck(dice[i1], dice[i2]));
				}
			}
		}
		
		if(a) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}

class Dice{
	int[] s = new int[4];
	int[] t = new int[2];
	
	Dice(Scanner sc) {
		t[0] = sc.nextInt();
		s[0] = sc.nextInt();
		s[3] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		t[1] = sc.nextInt();
	}
	
	static boolean rollCheck(Dice dice1, Dice dice2) {
		boolean a1 = false;
		
		a1 = a1 || Dice.check(dice1, dice2);
		dice1.turnN();
		a1 = a1 || Dice.check(dice1, dice2);
		dice1.turnE();
		a1 = a1 || Dice.check(dice1, dice2);
		dice1.turnE();
		a1 = a1 || Dice.check(dice1, dice2);
		dice1.turnE();
		a1 = a1 || Dice.check(dice1, dice2);
		dice1.turnN();
		a1 = a1 || Dice.check(dice1, dice2);
		
		return a1;
	}
	
	static boolean check(Dice dice1, Dice dice2){
		boolean a = false;
		
		if(dice2.t[0] == dice1.t[0]) {
			for(int its = 0; its < 4; its++) {
				if(dice2.s[0] == dice1.s[its]) {
					if(dice2.s[1] == dice1.s[(its+1)%4] 
						&& dice2.s[2] == dice1.s[(its+2)%4] 
						&& dice2.s[3] == dice1.s[(its+3)%4] 
						&& dice2.t[1] == dice1.t[1]) {
						a = true;
					}
				}
			}
		}
		
		return a;
	}
	
	void turnN() {
		int x = t[0];
		t[0] = s[0];
		s[0] = t[1];
		t[1] = s[2];
		s[2] = x;
	}
	
	void turnS() {
		int x = t[0];
		t[0] = s[2];
		s[2] = t[1];
		t[1] = s[0];
		s[0] = x;
	}
	
	void turnE() {
		int x = t[0];
		t[0] = s[1];
		s[1] = t[1];
		t[1] = s[3];
		s[3] = x;
	}
	
	void turnW() {
		int x = t[0];
		t[0] = s[3];
		s[3] = t[1];
		t[1] = s[1];
		s[1] = x;
	}
}
