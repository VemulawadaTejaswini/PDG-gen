import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
		String str=reader.readLine();
		String[] spl =str.split(" ");
		int[] intArray=new int[3];
		intArray[0]=Integer.parseInt(spl[0]);
		intArray[1]=Integer.parseInt(spl[1]);
		intArray[2]=Integer.parseInt(spl[2]);


		Arrays.sort(intArray);
		System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]);

		}catch(IOException e){
			System.out.println("??¨??????:"+e);
		}


	}


}