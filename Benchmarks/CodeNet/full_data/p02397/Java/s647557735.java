import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		for(;;){

			String str=reader.readLine();
			String[] str_Array=str.split(" ");

			int x=Integer.parseInt(str_Array[0]);
			int y=Integer.parseInt(str_Array[1]);

			if(x==0&&y==0)break;

			if(x>y){System.out.println(y+" "+x);}
			else{System.out.println(x+" "+y);}

		}
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}