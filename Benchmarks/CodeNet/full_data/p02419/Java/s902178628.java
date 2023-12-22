import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String x=br.readLine();
		String str;
		int count=0;
		for(;(str=br.readLine())!="END_OF_TEXT";){
			if(str.contains(x))count++;
		}
		System.out.println(count);
		
	
	
	}}