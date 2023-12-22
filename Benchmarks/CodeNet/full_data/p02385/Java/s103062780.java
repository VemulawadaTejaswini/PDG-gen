import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice dice=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
        Dice dice2=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
        	int ans=dice2.ans(dice, dice2);
        	if(ans==0) {
        		System.out.println("Yes");
        	}else if(ans==1) {
        		System.out.println("No");
        	}
    }
}

class Dice{
	int Top;	//1
	int S;		//2
	int N;		//5
	int W;		//4
	int E;		//3
	int Bo;		//6
	int tmp;
	
	Dice(int a,int b,int c,int d,int e,int f){
		Top=a;
		S=b;
		N=e;
		W=d;
		E=c;
		Bo=f;
	}
	
	void TrunS() {
		tmp=Top;
		Top=N;
		N=Bo;
		Bo=S;
		S=tmp;
	}void TrunN() {
		tmp=Top;
		Top=S;
		S=Bo;
		Bo=N;
		N=tmp;
	}void TrunW() {
		tmp=Top;
		Top=E;
		E=Bo;
		Bo=W;
		W=tmp;
	}void TrunE() {
		tmp=Top;
		Top=W;
		W=Bo;
		Bo=E;
		E=tmp;
	}
	int ans(Dice dice,Dice dice2) {		//DICEⅢの課題に対するメソッド
		int x=1;
		int count=0;
		if(dice.Top==dice2.W) {
			dice2.TrunE();
		}else if(dice.Top==dice2.N) {
			dice2.TrunS();
		}else if(dice.Top==dice2.E) {
			dice2.TrunW();
		}else if(dice.Top==dice2.S) {
			dice2.TrunN();
		}else if(dice.Top==dice2.Bo) {
			dice2.TrunS();
			dice2.TrunS();
		}								//ここでTop調整終了
	if(dice.Bo==dice2.Bo) {
	if(dice.S==dice2.N) {
		if(dice.E==dice2.W && dice.W==dice2.E) {
			x=0;;
		}
	}else if(dice.S==dice2.S) {
		if(dice.E==dice2.E && dice.W==dice2.W) {
			x=0;
		}
	}else if(dice.S==dice2.E) {
		if(dice.E==dice2.N && dice.W==dice2.S) {
			x=0;
		}
	}else if(dice.S==dice2.W) {
		if(dice.E==dice2.S && dice.W==dice2.N) {
			x=0;
		}
	}
	if(dice.S==dice2.S) {
		count++;
	}if(dice.W==dice2.W) {
		count++;
	}if(dice.N==dice2.N) {
		count++;
	}if(dice.E==dice2.E) {
		count++;
	}if(3<=count && count<=4) {
		x=0;
	}
	}
	return x;
}
}
