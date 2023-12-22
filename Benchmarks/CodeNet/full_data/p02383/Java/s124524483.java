import java.util.Scanner;

class Main {

	public static void main(String[] args) {

				
		//サイコロを生成
		Dice dice = new Dice();
		//サイコロの目を入力から読み込む
		Scanner scanner = new Scanner(System.in);
		dice.readInput(scanner);
		
		//命令を読み込み
		String command = scanner.next();
		
		//Scannerを閉じる
		scanner.close();
		
		//命令を1文字ずつ処理
		for (int i=0; i<command.length(); i++) {
			char cmd = command.charAt(i); //i番目の文字を取得
			switch (cmd) { //cmdの値によって分岐
			case 'N':
				dice.rollN(); //北方向に回転
				break;
			case 'S':
				dice.rollS(); //南方向に回転
				break;
			case 'E':
				dice.rollE(); //東方向に回転
				break;
			case 'W':
				dice.rollW(); //西方向に回転
				break;
			}
		}
		
		//結果を出力
		System.out.println(dice.getTop());
	}

}

class Dice {

	//メンバ変数
	//上面、前面、右面、左面、背面、下面の順
	private int[] faces = new int[6];
	
	//サイコロの目を入力から読み込む
	public void readInput(Scanner scanner) {
		for (int i = 0; i < 6; i++) {
			faces[i] = scanner.nextInt();
		}
	}
	
	//北方向に回転
	public void rollN() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[1]; //front → top
		faces[1] = faces[5]; //bottom → front
		faces[5] = faces[4]; //back → bottom
		faces[4] = temp; //top → back
	}
	
	//南方向に回転
	public void rollS() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[4]; //back → top
		faces[4] = faces[5]; //bottom → back
		faces[5] = faces[1]; //front → bottom
		faces[1] = temp; //top → front
	}
	
	//東方向に回転
	public void rollE() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[3]; //left → top
		faces[3] = faces[5]; //bottom → left
		faces[5] = faces[2]; //right → bottom
		faces[2] = temp; //top → right
	}
	
	//西方向に回転
	public void rollW() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[2]; //right → top
		faces[2] = faces[5]; //bottom → right
		faces[5] = faces[3]; //left → bottom
		faces[3] = temp; //top → left
	}
	
	//getterおよびsetter
	public int getTop() {
		return faces[0];
	}
	public void setTop(int top) {
		this.faces[0] = top;
	}
	public int getFront() {
		return faces[1];
	}
	public void setFront(int front) {
		this.faces[1] = front;
	}
	public int getRight() {
		return faces[2];
	}
	public void setRight(int right) {
		this.faces[2] = right;
	}
	public int getLeft() {
		return faces[3];
	}
	public void setLeft(int left) {
		this.faces[3] = left;
	}
	public int getBack() {
		return faces[4];
	}
	public void setBack(int back) {
		this.faces[4] = back;
	}
	public int getBottom() {
		return faces[5];
	}
	public void setBottom(int bottom) {
		this.faces[5] = bottom;
	}
	
	//
}

