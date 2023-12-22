import java.util.*;
class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Dice dice1 = new Dice(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
		Dice dice2 = new Dice(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
		boolean a = solv(dice1, dice2, 0);
		System.out.println((a)?"Yes":"No");
	}
	public static boolean solv(Dice f, Dice dice,int count) {
		if(dice.Top == f.Top && dice.S == f.S && dice.Bottom == f.Bottom && dice.E == f.E && dice.N == f.N && dice.W == f.W) return true;
		if(count == 4) return false;
		Dice tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnN();
		if(solv(f,tmp,count+1)) {
			return true;
		}
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		if(solv(f,tmp,count+1)) {
			return true;
		}
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnE();
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnW();
		if(solv(f,tmp,count+1)) {
			return true;
		}
		
		return false;
	}
	
	
	
}

class Dice {
	int Top; //1
	int Bottom; //6
	int N; //   5
	int S; //   2
	int W; //左 4
	int E; //右 3
	Dice(int a, int b, int c, int d, int e, int f) {
		Top = a;
		S = b;
		E = c;
		W = d;
		N = e;
		Bottom = f;
	}
	public void TurnN() {
		int tmp = Top;
		Top = S;
		S = Bottom;
		Bottom = N;
		N = tmp;
	}
	public void TurnW() {
		int tmp = Top;
		Top = E;
		E = Bottom;
		Bottom = W;
		W = tmp;
	}
	public void TurnE() {
		int tmp = Top;
		Top = W;
		W = Bottom;
		Bottom = E;
		E = tmp;
	}
	public void TurnS() {
		int tmp = Top;
		Top = N;
		N = Bottom;
		Bottom = S;
		S = tmp;
	}
	
}