import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String Sdash = scan.next();
		String T =scan.next();
		StringBuilder X = new StringBuilder();
		X.append(Sdash);
		boolean jyouken =false;
		
		
		for(int i = 0;i<Sdash.length()-T.length()+1;i++) {//Tの文字が何番目に入るかチェック
			int okcount = 0;
			for(int j = 0;j<T.length();j++) {//Tの文字とSdashの文字それぞれ比較
				
				if(Sdash.substring(i+j, i+j+1).equals(T.substring(j, j+1))) {//同じ文字ならOK
					okcount+=1;
					}else if(Sdash.substring(i+j, i+j+1).equals("?")) {//文字が？でもok
						okcount +=1;
						}else {//それ以外なら、つまり文字が合ってなければダメ
						}
			}
			
			if(okcount==T.length()) {
				X.replace(i, i+T.length(), T);
				jyouken = true;
				break;
			}
		}
		
		
		
		if(jyouken==false) {
			System.out.println("UNRESTORABLE");
		}else {
			for(int i = 0;i<X.toString().length();i++) {
				if(X.toString().substring(i, i+1).equals("?")) {
					X.replace(i, i+1,  "a");
				}
			}
			
		System.out.println(X.toString());
		}
		
		
		
		
		
	}

}
