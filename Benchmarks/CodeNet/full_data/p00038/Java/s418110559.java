import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		int nArray[] = new int[5];

		while((str=br.readLine()) != null){
			strArray = str.split(",");

			for(int i=0; i<5; i++){
				nArray[i] = Integer.parseInt(strArray[i]);
			}

			Arrays.sort(nArray);
			System.out.println(judgement(nArray));

		}
	}

	static String judgement(int n[]){
		String re="null";
		if(n[0] == 1 && n[1] == 10 && n[2] == 11 && n[3] == 12 && n[4] == 13){
			re="straight";
		}
		else if(n[1]==n[0]+1 && n[2]==n[1]+1 && n[3]==n[2]+1 && n[4]==n[3]+1){
			re="straight";
		}
		else if((n[0]==n[2] && n[1]==n[3]) || (n[1]==n[3] && n[2]==n[4])){
			re="four card";
		}
		else if((n[0]==n[2] || n[2]==n[4]) && (n[0]==n[1] || n[3]==n[4])){
			re="full house";
		}
		else if(n[0]==n[2] || n[1]==n[3] || n[2]==n[4]){
			re="three card";
		}
		else if((n[0]==n[1] && (n[2]==n[3] || n[3]==n[4])) ||
				((n[0]==n[1] || n[1]==n[2]) && n[3]==n[4])){
			re="two pair";
		}
		else if(n[0]==n[1] || n[1]==n[2] || n[2]==n[3] || n[3]==n[4]){
			re="one pair";
		}
		return re;
	}
}