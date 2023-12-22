import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	ArrayList<String>	list;
	ArrayList<String>	numList1,numList2;
	int count = 0;

	public Main(){
		list = new ArrayList<String>();
		numList1 = new ArrayList<String>();
		numList2 = new ArrayList<String>();
	}


	public void start(){
		String str;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//BufferedReader br = new BufferedReader(new FileReader("sampleData/id10030D.txt"));
			while((str=br.readLine())!=null){
				list.add(str.trim());				//すべての行をlistに追加
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] s1	=	list.get(1).split(" ");		//Sの要素を配列に格納
		String[] s2 =	list.get(3).split(" ");		//Tの要素を配列に格納

		for(int i=0; i<s1.length; i++){				//ArrayListに追加
			numList1.add(s1[i]);
		}
		for(int i=0; i<s2.length; i++){
			numList2.add(s2[i]);
		}
		
		//要素の比較
		for(int i=0; i<numList1.size(); i++){			
			String sample = numList1.get(i);			//Sのi番目の要素について

			for(int j=0; j<numList2.size(); j++){
				if(sample.equals(numList2.get(j))){		//Tのj番目の要素と一致したら
					numList2.set(j, " ");				//j番目の要素を空白文字に置き換えて
					count++;							//カウントする
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		new Main().start();
	}
}