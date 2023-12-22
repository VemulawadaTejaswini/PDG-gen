
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//文字を読み取る。
			String strW = insBR.readLine();
			char[] chW = new char[strW.length()];
			chW = strW.toCharArray();
			/*for(int i = 0; i < chW.length; i++){
				chW[i] = Character.toLowerCase(chW[i]);
			}*/
			List<String> list = new ArrayList<String>();
			while(true){
				String strLine = insBR.readLine();
				if(!"END_OF_TEXT".equals(strLine)){
					list.add(strLine);
				}else{
					break;
				}
			}

			char[][] chT = new char[list.size()][1000];
			for(int i = 0; i < list.size(); i++){
				chT[i] = list.get(i).toCharArray();
			}

			for(int i = 0; i < chT.length; i++){
				for(int j = 0; j < chT[i].length; j++){
					chT[i][j] = Character.toLowerCase(chT[i][j]);
				}
			}
			list.clear();
			for(int i = 0; i < chT.length; i++){
				//list.add(String.valueOf(chT[i]));
				String strLine = String.valueOf(chT[i]);
				String[] strLine2 = strLine.split(" ");
				for(int j = 0; j < strLine2.length; j++){
					list.add(strLine2[j]);
				}
			}

			int intCount = 0;
			for(int i = 0; i < list.size(); i++){
				String strT = list.get(i);
				if(strW.equals(strT)){
					intCount++;
				}
			}


			/*String[] strCount = strT.split(strW);
			if(strT.indexOf(strW,0) == 0){
				intCount = strCount.length - 1;
			}else{
				intCount = strCount.length;
			}*/


			//含まれている数を調べる。
			/*int intCount = 0;
			for(char chT : strT.toCharArray()){
				if(chW.equals(chT)){
					System.out.println("if文はいった");
					intCount++;
				}
			}*/

			//出力。
			System.out.println(intCount);

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}
/*
aaa aizu xxx xx x xxx aizu y yyyy a a a a a a aizu
aaa aa xxx WWW AAA aize aiza AIZZ AAA III a i z u aizu aizu aizu
SSS SS S aizu AAAAAAA a a a a a x x x x aizu zia uzia uzia aizu aizu aizu aizu
Aizu hyoooon pupupupu ohohohoh
aa eee fff eee fff ee f f f f f f f AIZU bebebebebebe ai zu a izu aiz u
Aizu aizu Aizu AIzU
end_of_text
END_OF_TEXP
aizu Aizu
 */

