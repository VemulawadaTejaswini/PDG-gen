import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String[] a=s.split(" ");
		for(int i=s.length();i>0;i--){
			System.out.print(" "+a[i-1]);
		}
}}