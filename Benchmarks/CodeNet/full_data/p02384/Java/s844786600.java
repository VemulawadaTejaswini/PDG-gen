import java.util.*;
class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Dice dice = new Dice(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
		int a = stdIn.nextInt();
		for(int i = 0; i < a; i++) {
			int T = stdIn.nextInt();
			int S = stdIn.nextInt();
			Dice copy = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
			
			int ans = solv(T,S,copy,0); 
			System.out.println(ans);
		}
	}
	public static int solv(int a, int b, Dice dice,int count) {
		if(dice.Top == a && dice.S == b) return dice.E;
		if(count == 4) return -1;
		int ans = -1;
		Dice tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnN();
		ans = Math.max(solv(a,b,tmp,count+1),ans);
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnS();
		ans = Math.max(solv(a,b,tmp,count+1),ans);
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnE();
		ans = Math.max(solv(a,b,tmp,count+1),ans);
		tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
		tmp.TurnW();
		ans = Math.max(solv(a,b,tmp,count+1),ans);
		
		return ans;
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