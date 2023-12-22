import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String []input_array=input.readLine().split(" ");

		int value_x=Integer.parseInt(input_array[0]);

		int value_y=Integer.parseInt(input_array[1]);

		if(value_x>value_y){

			int num=value_x;

			value_x=value_y;

			value_y=num;
		}

		int common_divisor_num=0;

		for(int num=1; num<=value_x; num++){

			if(value_x%num==0&&value_y%num==0){

				common_divisor_num=num;

			}
		}

		System.out.println(common_divisor_num);

	}

}