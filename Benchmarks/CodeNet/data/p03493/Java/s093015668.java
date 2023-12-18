import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int count=0;
		for(int i=0;i<line.length();i++){
			char ch = line.charAt(i);
			if(ch=='1'){
				count++;
			}
		}
		System.out.println(count);
	}
}