import java.io.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] word=str.split(" ",0);
		for(String words:word){
			char[] chara=words.toCharArray();
			for(char charac:chara){
				if (charac>=97 && charac<=122){
					charac=(char) (charac-32);
					System.out.print(charac);
				}else{
					System.out.print(charac);
				}
			}
			System.out.print(" ");
		}
	}
}