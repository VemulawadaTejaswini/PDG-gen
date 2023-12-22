import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)!='@'){
				System.out.print(str.charAt(i));
			}
			else{
				int n= Character.getNumericValue(str.charAt(i+1));
				for(int j = 0; j<n ; j ++){
					System.out.print(str.charAt(i+2));
				}
				i+=2;
			}
		}
		System.out.println("");
	}
}