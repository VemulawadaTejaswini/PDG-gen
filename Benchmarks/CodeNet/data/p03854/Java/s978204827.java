import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		int roop;
		int sLen[];		//各見本の長さ
		String[] s;		//見本
		
		StringBuffer S;		//入力
		
		boolean isEqual;		//判定結果
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		S = new StringBuffer(scan.next());
		scan.close();
		
		roop = 0;
		sLen = new int[]{7, 5, 6, 5};
		s = new String[]{ "dreamer", "dream", "eraser", "erase" };
		
		//処理//
		isEqual = false;
		
		while( roop < s.length ){
			System.out.println(S);
			System.out.println(S.length());
			System.out.println(roop);
			if( s[roop].equals((String)S.substring(0, sLen[roop])) ){
				S.delete(0, sLen[roop]);
				if( S.length() == 0 ){
					isEqual = true;
					break;
				}
				roop = 0;
				continue;
			}
			
			roop++;
		}
		
		//結果//
		if(isEqual){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
