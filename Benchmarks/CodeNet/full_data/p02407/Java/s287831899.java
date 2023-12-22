import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("file01.txt"));
		
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String[] a=s.split(" ");
		for(int i=a.length;i>0;i--){
			System.out.print(a[i-1]);
			if(i!=1)System.out.print(" ");
		}br.close();System.out.println();
}}