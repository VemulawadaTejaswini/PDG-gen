
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//行にダイスの番号、列にダイスの各面の数を代入する
		int[][] num = new int[n][6];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 6; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		//n個のサイコロを扱うDicesインスタンス
		Dices d = new Dices(num);
		
		//すべてのサイコロが合同かどうかを判断
		if(d.allDicesNotCongruence()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}

class Dices {
	//
	int[][] side;
	//コンストラクタ
	Dices(int[][] num){
		side = new int[num.length][6];
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < 6; j++) {
				this.side[i][j] = num[i][j];
			}
		}
	}

	//tar番目のダイスとref番目のダイスが合同なら1を、異なるなら0を返す
	public int checkCon(int tar, int ref) {
		int isCon = 0;
		int cnt = 6;
		for (int i = 0; i < 6; i++) {
			if (this.side[tar][i] == this.side[ref][i])
				cnt--;
		}
		if (cnt == 0) {
			isCon = 1;
		}
		return (isCon);
	}

	//四方向から確かめ、合同な場合が存在すれば1,しなければ0を返す
	public int tryRotPosition(int tar, int ref) {
		int cnt = 0;
		cnt += checkCon(tar, ref);
		for (int i = 0; i < 3; i++) {
			this.rotR(tar);
			cnt += checkCon(tar, ref);
		}
		return (cnt >= 1 ? 1 : 0);
	}
	
	//tar番目のダイスとref番目のダイスが同一かを調べるメソッド
	//targetを転がし、それぞれの位置において四方向から判別
	//二つのダイスが同一なら1、異なれば0を返す
	public int checkDices(int tar, int ref) {
		int isCon = 0;
		int cnt = 0;
		cnt += this.tryRotPosition(tar, ref);
		this.rollN(tar);
		cnt += this.tryRotPosition(tar, ref);
		this.rollN(tar);
		cnt += this.tryRotPosition(tar, ref);
		this.rollW(tar);
		cnt += this.tryRotPosition(tar, ref);
		this.rollE(tar);
		cnt += this.tryRotPosition(tar, ref);
		this.rollE(tar);
		cnt += this.tryRotPosition(tar, ref);
		if (cnt >= 1) {
			isCon = 1;
		}
		return(isCon);
	}
	
	public boolean allDicesNotCongruence() {
		int isCon = 0;
		for(int i = 0; i < this.side.length -1; i++) {
			for(int j = i + 1; j < this.side.length; j++) {
				isCon += checkDices(i, j);
			}
		}
		return(isCon == 0 ? true : false);
	}

	
	//i番目のダイスを回転させるメソッド群
	
	public void rollE(int i) {
		int w = this.side[i][5];
		this.side[i][5] = this.side[i][2];
		this.side[i][2] = this.side[i][0];
		this.side[i][0] = this.side[i][3];
		this.side[i][3] = w;
	}

	public void rollW(int i) {
		int w = this.side[i][5];
		this.side[i][5] = this.side[i][3];
		this.side[i][3] = this.side[i][0];
		this.side[i][0] = this.side[i][2];
		this.side[i][2] = w;
	}

	public void rollN(int i) {
		int w = this.side[i][5];
		this.side[i][5] = this.side[i][4];
		this.side[i][4] = this.side[i][0];
		this.side[i][0] = this.side[i][1];
		this.side[i][1] = w;
	}

	public void rollS(int i) {
		int w = this.side[i][5];
		this.side[i][5] = this.side[i][1];
		this.side[i][1] = this.side[i][0];
		this.side[i][0] = this.side[i][4];
		this.side[i][4] = w;
	}

	public void rotR(int i) {
		int w = this.side[i][1];
		this.side[i][1] = this.side[i][2];
		this.side[i][2] = this.side[i][4];
		this.side[i][4] = this.side[i][3];
		this.side[i][3] = w;
	}
}

