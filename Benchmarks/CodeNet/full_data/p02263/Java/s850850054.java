import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int SIZE = 105;

		Stack stack = new Stack(SIZE);
		int num_1 = 0,num_2 = 0;

		try {

			String input_str[] = br.readLine().split("\\s+");
			for(int i = 0; i < input_str.length; i++){
				switch(input_str[i]){
				case "+":

					num_2 = stack.pop_NUM();
					num_1 = stack.pop_NUM();
					stack.push_NUM(num_1+num_2);
					break;

				case "-":

					num_2 = stack.pop_NUM();
					num_1 = stack.pop_NUM();
					stack.push_NUM(num_1-num_2);
					break;

				case "*":

					num_2 = stack.pop_NUM();
					num_1 = stack.pop_NUM();
					stack.push_NUM(num_1*num_2);
					break;

				default:

					stack.push_NUM(Integer.parseInt(input_str[i]));
					break;
				}
			}

			System.out.println(stack.pop_NUM());

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



	}
}

class Stack{

	private int NUM[];
	private int index_NUM;

	Stack(int arg_size){
		NUM = new int[arg_size];
		index_NUM = 0;
	}
	public void push_NUM(int num){

		NUM[index_NUM++] = num;
	}
	public int pop_NUM(){
		index_NUM--;
		return NUM[index_NUM];
	}

	public boolean is_Empty(){

		return index_NUM == 0;
	}
}
