import java.util.ArrayList;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 100000000;
	static	boolean[] flag ;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		String S = sc.next();
		String T = sc.next();
		char[] ansc = S.toCharArray();
		
		for(int i = 0;i <= S.length()-T.length();i++){
			ansc = S.toCharArray();
//			System.out.println("i " + i);

			if(S.charAt(i) == '?' || S.charAt(i) == T.charAt(0)){				//Sのi文字目が?かTの初めの文字と一緒ならそこから判定
				int c = 0;
				for(int j = i;c < T.length();j++){
//					System.out.println("j " + j);

					if(S.charAt(j) != '?' && S.charAt(j) != T.charAt(c)){			//もしSのj文字めが?でもTのc文字目でもないのなら無理
						break;
					}else{
						ansc[j] = T.charAt(c);
					}

					if(j ==T.length()+i -1){
						for(int k = 0;k < S.length();k++){				//?にaを入れていく
							if(ansc[k] == '?'){
								ansc[k] = 'a';
							}
						}
						String aString = new String(ansc);
						System.out.println(aString);
						return;
					}
					c++;
				}
				
			}

		}


		System.out.println("UNRESTORABLE");




	}

}
class Bridge{
	int p;			//自分の場所
	ArrayList<Integer> town = new ArrayList<Integer>();				//辺でつながっている町
	public Bridge(int n) {
		p = n;
	}
	void addtown(int t){
		town.add(t);
	}

	int townnum(){
		return town.size();
	}





}


