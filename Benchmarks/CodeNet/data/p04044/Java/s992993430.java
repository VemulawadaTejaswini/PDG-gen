
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String text[] = line.split(" ");
		int N = Integer.parseInt(text[0]);
		int L = Integer.parseInt(text[1]);
		
		String s[] = new String[N];
		
		int count = 0;
		while(count < L ){
			s[count] =  br.readLine();
//			System.out.println(count + ":" + s[count]);
			count ++;
		}
//		System.out.println("call");
		
		//s[1]が大きけりゃtrue
//		System.out.println(s[1].compareTo(s[2])>0);
		//S1~Snを辞書順に並び替えるー＞バブルソート！
		count = 0;
		while(count < L){
			for(int i = 0; i < L-1 ; i++){
				if(s[i].compareTo(s[i + 1]) > 0){
					swap(s, i , i+ 1);
				}
			}
			count++;
		}
		String ans = "";
		for(int i = 0; i < L; i++){
			ans += s[i];
		}
		System.out.println(ans);
	}
	//a番目とb番目の要素を交換
	static String[] swap(String[] txt, int a, int b){
		String s = txt[a];
		txt[a] = txt[b];
		txt[b] = s;
		return txt;
	}
}
