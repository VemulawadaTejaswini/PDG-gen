import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){


		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] text;
		int text_num;

		try{
			text=reader.readLine().split("");

		text_num=text.length;

		for(int i=0;i<text_num;i++){
			if(text[i].equals(text[i].toLowerCase())){
				text[i]=text[i].toUpperCase();
			}
			else if(text[i].equals(text[i].toUpperCase())){
				text[i]=text[i].toLowerCase();
			}

			System.out.print(text[i]);
		}System.out.println();


		reader.close();

		}catch(IOException e){
			System.out.println("??????:"+e);
		}




	}
}