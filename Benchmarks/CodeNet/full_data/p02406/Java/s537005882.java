import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		for(int i=3;i<=a;i++){
			if(i%10==3||i%3==0)System.out.print(" "+i);	
			
		}//System.out.println();
}}