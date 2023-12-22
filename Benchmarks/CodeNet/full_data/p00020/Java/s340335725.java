import java.io.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] word=str.split(" ",0);
		int lengthC=word.length;
		for(int i=0;i<lengthC;i++){
			char[] chara=word[i].toCharArray();
			for(char charac:chara){
				if (charac>=97 && charac<=122){
					charac=(char) (charac-32);
					System.out.print(charac);
				}else{
					System.out.print(charac);
				}
			}
			if (i!=lengthC-1){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
		
	}
}