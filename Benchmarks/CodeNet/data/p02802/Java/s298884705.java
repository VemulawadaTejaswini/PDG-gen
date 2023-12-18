import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt(); //問題数
		int M = sc.nextInt(); //回答数

		boolean bool = true;
		int[] question = new int[M]; //回答数分領域確保
		String[] anser = new String[M];
		int count = 100001;
		int maru = 0;
		int batu = 0;
		for(int i= 0; i < M; i++) {
			question[i] = sc.nextInt();
			anser[i] = sc.nextLine().trim();
		}

		for(int i = 0; i < question.length; i++) {

			if(anser[i].equals("AC")) {
				maru = count!=question[i]? maru+1:maru;
				count = question[i];
		}else if(count != question[i]){ //ACがあった問題番号と一緒じゃないか
				batu++;
			}
		}
//	}
	System.out.println(maru);
	System.out.println(batu);
	}

}