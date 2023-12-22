import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s="wa";

		try{
		for(int i=0; s!=null;i++){
			s=reader.readLine();
			int x=Integer.parseInt(s);

			System.out.println("Case "+i+": "+x);


		}
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}