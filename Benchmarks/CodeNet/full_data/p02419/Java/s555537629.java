import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
			String W=reader.readLine();
			String text=reader.readLine();

		while(true){
		String p=reader.readLine();
		if(p.equals("END_OF_TEXT"))break;
		text+=p;
		}

		Pattern p=Pattern.compile(W);
		Matcher m=p.matcher(text);
		int count=0;
		while(m.find()){
			count++;
		}
		System.out.println(count);


		}catch(IOException e){
			System.out.print(e);
		}
	}

}