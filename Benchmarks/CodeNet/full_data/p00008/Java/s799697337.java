import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s;
		while((s=reader.readLine())==null){
			int in=Integer.parseInt(s);
		//int in;
		//while((in=reader.nextInt())!=EOF){
			int co=0;
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					for(int k=0;k<10;k++)
						if(in-i-j-k>=0&&in-i-j-k<10)co++;
			System.out.println(co);
		}

	}
}