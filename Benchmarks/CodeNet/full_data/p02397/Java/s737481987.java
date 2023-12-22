import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			String strArray[] = str.split(" ", 0);
			int num1 = Integer.parseInt(strArray[0]);
			int num2 = Integer.parseInt(strArray[1]);

			if(num1 == 0 && num2 ==0){
				break;
			}
			else{
				if(num1 <= num2){
					System.out.println(num1 + " " + num2);
				}
				else if(num2 < num1){
					System.out.println(num2 + " " + num1);
				}
			}
		}
	}

}