import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(char c: str.toCharArray()){
			if(Character.isUpperCase(c)){
			System.out.println(Character.toLowerCase(c));
			}else{
			System.out.println(Character.toUpperCase(c));
			}
		}
	}
}