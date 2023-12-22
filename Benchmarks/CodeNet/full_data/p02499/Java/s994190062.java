import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		
		while((s=br.readLine().toLowerCase())!=null){
			int[] a=new int[200];
			for (int i = 0; i < s.length(); i++) {
				a[s.charAt(i)]++;
			}
			for (int i = 'a'; i <= 'z'; i++) {
				System.out.println((char)i+" : "+a[i]);
			}
		}

	}

}