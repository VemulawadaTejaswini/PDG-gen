import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int x1, x2, y1, y2;
		double d;
		String str;
		String[] array_str;

		try{
			str=reader.readLine();
			array_str=str.split(" ");
			x1=Integer.parseInt(array_str[0]);
			y1=Integer.parseInt(array_str[1]);
			x2=Integer.parseInt(array_str[2]);
			y2=Integer.parseInt(array_str[3]);

			d=Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));

            System.out.println(d);

		}catch(IOException e){
			System.out.print(e);
		}
	}

}