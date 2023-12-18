import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mojisu=sc.nextInt();
		String[] muki=new String[mojisu];
		String moji=sc.next();
		for(int i=0; i<mojisu; i++) {
			muki[i]=moji.charAt(i)+"";
		}

		int cnt=0;
		int min=114514810;
		//リーダーよりも前ならW→E　　後ろなら　E→Wにする
		for(int i=0; i<mojisu; i++) {
			cnt=0;
			for(int j=0; j<mojisu; j++) {
				if(j<i) {
					if(muki[j].equals("W")) {
						cnt++;
					}
				}
				else if(j>i) {
					if(muki[j].equals("E")) {
						cnt++;
					}
				}
			}
			if(min>cnt) {
				min=cnt;
			}
		}
		System.out.println(min);
	}
}