

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			try{

				//シャッフルした単語のリストを用意する。
				List<String> strList = new ArrayList<String>();

				while(true){

					//文字を読み取る。
					String strLine = insBR.readLine();
					if("-".equals(strLine)){
						break;
					}

					//シャッフル回数をリストにつめる。
					String strTime = insBR.readLine();
					int intTime = Integer.parseInt(strTime);
					List<Integer> intList = new ArrayList<Integer>();
					for(int i = 0; i < intTime; i++){
						String strShuffle = insBR.readLine();
						int intShuffle = Integer.parseInt(strShuffle);
						intList.add(intShuffle);
					}

					//仮の箱を用意する。
					List<String> actList = new ArrayList<String>();

					//単語を1文字ずつ区切る。
					String[] strWord = strLine.split("");

					//シャッフルした単語を初期化する。
					String strResult = "";

					//シャッフルする。
					for(int i = 0; i < intList.size(); i++){

						//シャッフル回数。
						int intTime2 = intList.get(i);

						//strResultを初期化する。
						strResult = "";

						//仮の箱のリストにつめる。
						int intNext = strLine.length() - intTime2;
						for(int j = 0; j < intTime2; j++){
							actList.add(strWord[j]);
						}

						//最初の文字をstrResultに足しこむ。
						for(int j = 0; j < intNext; j++){
							int intChange = j + intTime2;
							strResult += strWord[intChange];
						}

						//残りの文字をstrResultに足しこむ。
						for(int j = 0; j < actList.size(); j++){
							strResult += actList.get(j);
						}

						//strWord を strResult で初期化する。
						strWord = strResult.split("");

						//仮の箱のリストを空っぽにする。
						actList.clear();

					}

					//シャッフル回数のリストを空っぽにする。
					intList.clear();

					//シャッフルした単語をリストにつめる。
					strList.add(strResult);

				}

				//出力。
				for(int i = 0; i < strList.size(); i++){
					System.out.println(strList.get(i));
				}

			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}

	}

}

