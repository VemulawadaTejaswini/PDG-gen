import java.util.ArrayList;
import java.util.Scanner;


class Main {



	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);
		String W= scanner.nextLine();


		ArrayList<String> array = new ArrayList<String>();//単語ごとに格納するリストを生成

		int loop=0;//ループ制御用の変数
		int count=0;//単語カウント用の変数
		while (scanner.hasNextLine()) {//END_OF_TEXTが入力された場合終了
			
			String Tword= scanner.next();
			
			if (Tword.equals("END_OF_TEXT")) { 
				break;
			}
			Tword=Tword.toLowerCase( );
			
			array.add(Tword);//リストに格納
			
			loop=loop+1;
			
			}

		for(int i=0;i<loop;i++){
			
			String Word = array.get(i);
			if(Word.equals(W)){
				count=count+1;
			}
			
			
			
		}
		System.out.println(count);

		scanner.close();


	}
}


