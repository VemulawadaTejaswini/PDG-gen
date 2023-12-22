import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		
		while((s=br.readLine())!=null){
			s=s.toLowerCase();
			int[] a=new int[200];
			for (int i = 0; i < s.length(); i++) {
				try {
					a[s.charAt(i)]++;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			for (int i = 'a'; i <= 'z'; i++) {
				try {
					System.out.println((char)i+" : "+a[i]);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

}