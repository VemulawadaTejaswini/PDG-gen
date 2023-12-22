import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int taro_point = 0;
		int hanako_point = 0;
		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){

			String[] token = br.readLine().split(" ");
			String taro_card = token[0];
			String hanako_card = token[1];
			int compare = taro_card.compareTo(hanako_card);

			if(compare < 0){
				hanako_point += 3;
			}else if(compare > 0){
				taro_point += 3;
			}else if(compare == 0){
				taro_point++;
				hanako_point++;
			}

		}

		System.out.println(taro_point + " " + hanako_point);

	}
}