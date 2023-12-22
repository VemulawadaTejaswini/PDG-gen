import java.util.Scanner;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int[] chars= new int[256];
		String line;
		while((line =input.readLine())!=null){
			for (int i=0;i<line.length(); i++){
				char ch=Character.toLowerCase(line.charAt(i));
				chars[ch]++;
			}
		}
		for(char ch='a';ch<='z';ch++){
			System.out.println(ch + " : " + chars[ch]); 
		}
	}
}