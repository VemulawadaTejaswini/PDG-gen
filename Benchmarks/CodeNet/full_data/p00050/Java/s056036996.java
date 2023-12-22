import java.util.Scanner;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine(), tmp;
		char[] ch = word.toCharArray();

		for(int i=0; i<ch.length; i++){
			tmp = "";
			while(ch[i] != ' ' && i < ch.length - 1){
				tmp += ch[i++];	
			}
			if(tmp.equals("apple")) tmp = "peach";
			else if(tmp.equals("peach")) tmp = "apple";

			if(i != ch.length - 1){
				System.out.print(tmp+" ");
			}else{
				System.out.println(tmp+ch[i++]);
			}
		}
	}
}	