import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for(int i = 3; i <= num; i++){
			if(i % 3 == 0){
				System.out.print(checkNum(i));
			}else{
				System.out.print(include3(i));
			}
		}

		System.out.print("\n");

	}

	public static String checkNum(int num){

		if(num % 3 == 0){
			return " " + num;
		}

		return "";

	}

	public static String include3(int num){

		if(num % 10 == 3){
			return " " + num;
		}

		num /= 10;

		return num > 0 ? include3(num) : "";

	}
}