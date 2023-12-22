import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int len = str.length-1;
		str[len] = str[len].substring(0,str[len].length()-1);
		for(int i = 0 ; i < str.length ; i ++){
			if(str[i].equals("apple")){
				str[i]="peach";
			}
			else if(str[i].equals("peach")){
				str[i]="apple";
			}
		}
		for(int i = 0 ; i < str.length ; i ++){
			System.out.print((i==str.length-1)?str[i]:str[i]+" ");
		}
		System.out.println(".");
	}
}