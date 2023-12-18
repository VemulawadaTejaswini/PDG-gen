import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String[] S = new String[n];

		int l = 100;
		int num = 51;				//なんばんめの文字列か覚えておく


		for(int i = 0;i < n;i++){
			S[i] =sc.next();					//入力
			if(l > S[i].length()){				//最小長の文字列を発見する
				l = S[i].length();
				num = i;
			}

		}

		ArrayList<Character> ans = new ArrayList<Character>();				//一致文字をいれていく

		for(int i = 0;i < S[num].length();i++){
			boolean find = false;
			int count = 0;



			for(int j = 0;j < n;j++){				//文字列の選択
				if( j != num){
					for(int x = 0;x < S[j].length();x++){		//その文字列についてS[num].charat[i]があるかみる
						if(S[j].charAt(x) == S[num].charAt(i)){
							count++;

							break;
						}
					}


				}
			}
			if(count == n-1){					//全ての文字列でS[num].charat[i]があったらtrue
				find = true;
				for(int j = 0;j < num;j++){		//その文字列についてS[num].charat[i]があるかみる
					if(j != num){
						String string  = String.valueOf(S[num].charAt(i));
						S[j].replaceFirst(string, "");					//該当文字を消していく
					}
				}
			}

			if(find){
				ans.add(S[num].charAt(i));
			}
		}

		
		char[] aa = new char[ans.size()];
		for(int i = 0;i < ans.size();i++){
			aa[i] = ans.get(i);
		}
		Arrays.sort(aa);

		String pp = new String(aa);
		System.out.println(aa);


	}
}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


