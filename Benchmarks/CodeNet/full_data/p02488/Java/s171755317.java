import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = "ZZZZZZZZ";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		for(int i = 0;i < n;i++){
			try {
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(answer.compareToIgnoreCase(line)>=0){
				answer = line;
			}
		}
		System.out.println(answer);
	}

}