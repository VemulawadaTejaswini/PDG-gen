import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		Dice dice1 = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int kaburi = 0;
        while (sc.hasNext()) { 
        Dice dice2 = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        boolean a = solv(dice1, dice2, 0);
        if (a == true) kaburi++;
		}
      if (kaburi != 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");    
      }
	}
      
	public static boolean solv(Dice dice1, Dice dice2,int count) {
		if(dice1.Top == dice2.Top && dice1.S == dice2.S && dice1.Bottom == dice2.Bottom && dice1.E == dice2.E && dice1.N == dice2.N && dice1.W == dice2.W) return true;
		if(count == 6) return false;
		Dice tmp = new Dice(dice2.Top,dice2.S,dice2.E,dice2.W,dice2.N,dice2.Bottom);
		tmp.TurnN();
		if(solv(dice1,tmp,count+1)) {
			return true;
		}
		tmp = new Dice(dice2.Top,dice2.S,dice2.E,dice2.W,dice2.N,dice2.Bottom);
        tmp.TurnS();
		if(solv(dice1,tmp,count+1)) {
			return true;
		}
		tmp = new Dice(dice2.Top,dice2.S,dice2.E,dice2.W,dice2.N,dice2.Bottom);
		tmp.TurnE();
        if(solv(dice1,tmp,count+1)) {
			return true;
		}
		tmp = new Dice(dice2.Top,dice2.S,dice2.E,dice2.W,dice2.N,dice2.Bottom);
		tmp.TurnW();
		if(solv(dice1,tmp,count+1)) {
			return true;
		}
		return false;
	}
}

class Dice {
	int Top; 
	int Bottom; 
	int N; 
	int S; 
	int W; 
	int E; 
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
