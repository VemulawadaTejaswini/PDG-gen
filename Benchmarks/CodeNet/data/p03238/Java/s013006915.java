import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_ProgrammingEducation {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		int a,b;
		
		if(n==1)
		{
			System.out.println("Hello World");
		}
		else if(n==2)
		{
			String s =reader.readLine();
			String[] inp = s.split(" ");
			a=Integer.parseInt(inp[0]);
			b=Integer.parseInt(inp[1]);
			System.out.println(a+b);
			
		}
	}
	

}
