import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DiceOri dice=new DiceOri(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		String com=sc.next();
		for(int i=0;i<com.length();i++) {
			switch(com.substring(i,i+1)) {
			case "N":
				dice.TurnN();
				break;
			case "W":
				dice.TurnW();
				break;
			case "S":
				dice.TurnS();
				break;
			case "E":
				dice.TurnE();
				break;
			}
		}
		System.out.println(dice.Top);
	}

}

class DiceOri{
	int Top;
    int Bottom;
    int Nth;
    int Sth;
    int Wst;
    int Est;
    DiceOri(int a, int b, int c, int d, int e, int f) {
        Top = a;
        Sth = b;
        Est = c;
        Wst = d;
        Nth = e;
        Bottom = f;
    }
	public void TurnN() {
		int empty=Top;
		Top=Sth;
		Sth=Bottom;
		Bottom=Nth;
		Nth=empty;
	}
	public void TurnW() {
		int empty=Top;
		Top=Est;
		Est=Bottom;
		Bottom=Wst;
		Wst=empty;
	}
	public void TurnS() {
		int empty=Top;
		Top=Nth;
		Nth=Bottom;
		Bottom=Sth;
		Sth=empty;
	}
	public void TurnE() {
		int empty=Top;
		Top=Wst;
		Wst=Bottom;
		Bottom=Est;
		Est=empty;
	}
}
