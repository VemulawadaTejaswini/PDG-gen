
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fixString(br.readLine()));
	}
	public static String fixString(String str){
		String[] word = str.split(" ");
		StringBuffer bf = new StringBuffer();
		for(int i = 0; i < word.length; i++){
			bf.append(fixWord(word[i]));
			if(i != word.length - 1){
				bf.append(" ");
			}
		}
		return bf.toString();
	}
	private static String fixWord(String target){
		StringBuffer stringFixed = new StringBuffer();
		int indexHead;
		int indexTail;
		if((indexHead = target.indexOf("apple")) > -1){
			//appleをpeachに
			indexTail = indexHead + "apple".length();
			stringFixed.append(target.substring(0, indexHead));
			stringFixed.append("peach");
			stringFixed.append(target.substring(indexTail, target.length()));
		}
		else if((indexHead = target.indexOf("peach")) > -1){
			//peachをappleに置換する
			indexTail = indexHead + "peach".length();
			stringFixed.append(target.substring(0, indexHead));
			stringFixed.append("apple");
			stringFixed.append(target.substring(indexTail, target.length()));
		}
		else{
			stringFixed.append(target);
		}
		return stringFixed.toString();
	}
}