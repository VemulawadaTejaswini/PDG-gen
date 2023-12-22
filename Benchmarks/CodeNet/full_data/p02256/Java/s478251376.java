import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String []input_array=input.readLine().split(" ");

		int value_x=Integer.parseInt(input_array[0]);

		int value_y=Integer.parseInt(input_array[1]);

		if(value_x<value_y){

			int num=value_x;

			value_x=value_y;

			value_y=num;
		}

		int r=value_x%value_y;

		while(r!=0){

			value_x=value_y;

			value_y=r;

			r=value_x%value_y;

			}


		System.out.println(value_y);

	}

}