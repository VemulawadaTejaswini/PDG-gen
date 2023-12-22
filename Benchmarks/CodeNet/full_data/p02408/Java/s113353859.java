

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strN = insBR.readLine();
			int n = Integer.parseInt(strN);
			String[] strA = new String[n];
			for(int i = 0; i < n; i++){
				strA[i] = insBR.readLine();
			}
			//int intIndex = 0;
			String[] strToranpu = new String[4];
			strToranpu[0] = "S ";
			strToranpu[1] = "H ";
			strToranpu[2] = "C ";
			strToranpu[3] = "D ";
			/*String[][] strTora ={
				{"S 1","S 2","S 3","S 4","S 5","S 6","S 7","S 8","S 9","S 10","S 11","S 12","S 13"},
				{"H 1","H 2","H 3","H 4","H 5","H 6","H 7","H 8","H 9","H 10","H 11","H 12","H 13"},
				{"C 1","C 2","C 3","C 4","C 5","C 6","C 7","C 8","C 9","C 10","C 11","C 12","C 13"},
				{"D 1","D 2","D 3","D 4","D 5","D 6","D 7","D 8","D 9","D 10","D 11","D 12","D 13"},
			};
			String[] strTora52 = {
					"S 1","S 2","S 3","S 4","S 5","S 6","S 7","S 8","S 9","S 10","S 11","S 12","S 13",
					"H 1","H 2","H 3","H 4","H 5","H 6","H 7","H 8","H 9","H 10","H 11","H 12","H 13",
					"C 1","C 2","C 3","C 4","C 5","C 6","C 7","C 8","C 9","C 10","C 11","C 12","C 13",
					"D 1","D 2","D 3","D 4","D 5","D 6","D 7","D 8","D 9","D 10","D 11","D 12","D 13"
			};*/
			List<String> notExistList = new ArrayList<String>();
			//List<String> list = new ArrayList<String>();
			//String[] strList = new String[52-n];
			String strCard = "";
			/*int intList = 0;
			boolean blExist = false;*/
			for(int i = 0; i < 4; i++){
				for(int j = 1; j <= 13; j++){
					strCard = strToranpu[i] + j;
					notExistList.add(strCard);
				}
			}
			for(int i = 0; i < strA.length; i++){
				notExistList.remove(strA[i]);
			}
			for(int i = 0; i < notExistList.size(); i++){
				System.out.println(notExistList.get(i));
			}
			/*for(int i = 0; i < 4; i++){
				for(int j = 1; j <= 13; j++){
					for(int h =0; h < n; h++){
						intIndex = (strToranpu[i] + j).indexOf(strA[h]);
						if(intIndex == -1){
							list.add(strToranpu[i] + j);
						}
					}
				}
			}
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
			}
*/
			/*int h = 0;
			for(int i = 0; i < 52; i++){
				blExist = strTora52[i].matches(strA[h]);
				if(blExist == false){
					for(int j = 0; j < list.size(); j++){
						System.out.println("h=" + h);
						System.out.println("j=" + j);
						//if(0 < list.size() && !strA[h].equals(list.get(j - 1))){
							list.add(strTora52[i]);
						//}
					}
					list.add(strTora52[i]);
				}
				if(h != strA.length - 1){
					h++;
				}
			}
	*/


		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

