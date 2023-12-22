import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{

			String str=reader.readLine();
			String[] str_Array=str.split(" ");

			int a=Integer.parseInt(str_Array[0]);
			int b=Integer.parseInt(str_Array[1]);
			int c=Integer.parseInt(str_Array[2]);
			int count=0;
			for(int i=a;i<=b;i++){
				if(c%i==0)count++;
			}
			System.out.println(count);
			reader.close();


		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}