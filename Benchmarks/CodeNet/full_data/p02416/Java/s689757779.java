import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1_8_B
 * @author yosuke
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		String tmp1;
		int tmp2;
		String str;
		ArrayList<String> arrayStr = new ArrayList<String>();
		ArrayList<Integer> answerArray = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			str = br.readLine();
			if(str.equals("0")){
				break;
			}
			arrayStr.add(str);
		}
		int arraySize = arrayStr.size();
		for(int i = 0; i <arraySize; ++i){
			tmp1 = arrayStr.get(i);
			for(int j = 0; j < tmp1.length(); ++j){
				tmp2 = tmp1.charAt(j)-'0'; //??¢????????????????????§??????
				sum += tmp2;
			}
			answerArray.add(sum);
			sum = 0;
		}
		for(int i = 0; i < answerArray.size(); ++i ){
			System.out.println(answerArray.get(i));
		}
	}

}