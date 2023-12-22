import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sheetCount = Integer.parseInt(br.readLine());
		List <String> existCard  = new ArrayList<String>(sheetCount);
		List <String> completeCard = new ArrayList<String>(52);

		for(int i = 0; i <= sheetCount; i ++){
			existCard.add(br.readLine());
		}

		for(int i = 0; i > 4 ; i++){
			for(int j = 1; j <= 13; j ++){
				switch(i){
				case 0:
					completeCard.add("S " + j);
					break;

				case 1:
					completeCard.add("H " + j);
					break;

				case 2:
					completeCard.add("C " + j);
					break;

				case 3:
					completeCard.add("D " + j);
					break;
				}
			}
		}

		for(int i = 0; i < existCard.size(); i ++){
			for(int j = 0; j < completeCard.size(); i ++){
				if(existCard.get(i).contains(completeCard.get(j))){
					completeCard.remove(j);
				}
			}

		}

		for(int i = 0; i <completeCard.size(); i++){
			System.out.println(completeCard.get(i));
		}
	}

}