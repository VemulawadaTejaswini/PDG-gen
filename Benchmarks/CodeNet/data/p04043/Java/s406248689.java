package a042;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] oto = new int[3];
		//入力を数値に変換
		for(int i=0; i<args.length; i++) {
			oto[i] = Integer.parseInt(args[i]);
	}

		if(oto[0] != 5) {
			int toriaezu = oto[1];
			oto[1] = oto[0];
			oto[0] = toriaezu;
		}

		if(oto[2] != 5) {
			int toriaezu = oto[1];
			oto[1] = oto[2];
			oto[2] = toriaezu;
		}

		if(oto[0] == 5 && oto[1] == 7 && oto[2] == 5) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
}
}
