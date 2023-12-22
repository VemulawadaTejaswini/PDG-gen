import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		for(int i=0;i<word.length();i++){
			if(Character.isUpperCase(word.charAt(i))){
				System.out.print(Character.toLowerCase(word.charAt(i)));
			}else
				System.out.print(Character.toUpperCase(word.charAt(i)));
		}
	}
}