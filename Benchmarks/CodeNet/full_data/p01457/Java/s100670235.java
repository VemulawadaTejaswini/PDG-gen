

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(br.readLine());

		String[] tmpArray;
		//愚直に文字列を作ってみる
		StringBuffer sb = new StringBuffer();

		long left = 0;
		long right = 0;
		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			long pos = Long.parseLong(tmpArray[0]);
			char c = tmpArray[1].charAt(0);
			long n = Long.parseLong(tmpArray[2]);

			StringBuffer tmpSb = new StringBuffer();

//			for(int j = 0; j < n; j++){
//				tmpSb.append(c);
//			}

//			sb.insert(pos, tmpSb);

			if(c == '('){
				left += n;
			}
			else {
				right += n;
			}

//			System.out.println(sb);

			int len = sb.length();

			//判定
//			System.out.println("matching -> " + "({"+len/2+"}?){"+len/2+"}?");
			if(right == left){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
//
//			if(sb.length() % 2 == 1){
//				System.out.println("No");
//			}
//			else if(sb.toString().matches("\\({"+len/2+"}?\\){"+len/2+"}?")){
//
//				System.out.println("Yes");
//			}
//			else if(sb.toString().matches("\\){"+len/2+"}?\\({"+len/2+"}?")){
//
//				System.out.println("Yes");
//			}
//			else {
//				System.out.println("No");
//			}
		}
	}

}

