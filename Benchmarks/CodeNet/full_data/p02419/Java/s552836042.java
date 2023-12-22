import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		
		
		String str;
		String x=br.readLine();
		int count=0;
		for(;(str=br.readLine())!=null;){
			String[] stg=str.split(" ");
			for(String i:stg){
				if(i.equalsIgnoreCase(x))count++;
			}
		}System.out.println(count);
		}
		
		}