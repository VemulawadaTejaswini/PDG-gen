import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		String resultLine ="";
		
		for(int i=3; i<=num; i++)
		if(i%3==0 || i%10 ==3) {
			resultLine = " " + resultLine + i;
		}
		System.out.print(resultLine);
	}

}