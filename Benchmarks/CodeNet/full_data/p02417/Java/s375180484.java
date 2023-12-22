

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{

	// アルファベットの配列
	public static String[] alphabet_all = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");

		// アルファベットbeanのリスト
		ArrayList<alphabet> alpha_beans = new ArrayList<alphabet>();
		// 各アルファベットのbeanを作る
		for (String val : alphabet_all) {
			//
			alphabet hoge = new alphabet(val);
			alpha_beans.add(hoge);
		}
		
		System.out.print(dir);
		
		String line = "";
		try{

		// ファイル入力
        FileReader in = null;
        
        //テキストファイルを読み込む
        for(int i = 1; i < 5 ;i++){
        	//
            if(new FileReader("in"+i+".txt") != null){
            	in = new FileReader("in"+i+".txt");
            }
        }
        
        BufferedReader br = new BufferedReader(in);
		
		while ((line = br.readLine()) != null) {

			// 入力文字を1文字ずつに変換
			char ch[] = line.toCharArray();

			// 入力文字列がある分、まわす
			for (int i = 0; i < ch.length; i++) {

				// それぞれのアルファベットについて
				for (alphabet val : alpha_beans) {

					// 入力文字の一文字ずつとアルファベットの文字(大文字も小文字は区別しない)が一致したら
					if (val.getString().equals(
							String.valueOf(ch[i]).toLowerCase())) {
						// 一致したアルファベットの数字を増やす
						val.setNumber(1);

					}
				}
			}
		}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		// 出力
		for (alphabet val : alpha_beans) {
			//
			System.out.println(val.getString() + " : " + val.getNumber());
		}
	}
		
}

// 各アルファベットクラス
class alphabet {
	//
	private int number = 0;
	private String alphabet = "";

	// コンストラクタ
	alphabet(String a) {
		alphabet = a;
	}

	// セッター
	public void setNumber(int n) {
		number = n + number;
	}

	// ゲッター
	public int getNumber() {
		return number;
	}

	public String getString() {
		return alphabet;
	}
}