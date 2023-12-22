import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		String[] num = line.split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if(a > b) {
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
		
	}

}