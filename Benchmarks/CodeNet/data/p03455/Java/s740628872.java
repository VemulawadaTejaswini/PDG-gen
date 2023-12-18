import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);
		if((a * b) % 2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}