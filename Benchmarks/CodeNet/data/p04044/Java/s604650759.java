public class Main {
	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		String s = sd.next();
		String t = sd.next();

		//行数
		int a = Integer.parseInt(s);
		//文字列の長さ
		int b = Integer.parseInt(t);
		//配列に入力
		String[] mozi = new String[a];
		for(int i=0; i<a; i++) {
			mozi[i] = sd.next();
		}

		for(int i=0; i<a-1; i++) {
			for(int j=0; j<a-1; j++) {
				String temp;
				if(mozi[i].compareTo(mozi[i+1])<0) {
					temp=mozi[i];
					mozi[i]=mozi[i+1];
					mozi[i+1]=temp;
				}else {
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.print(mozi[i]);
		}
	}
}
