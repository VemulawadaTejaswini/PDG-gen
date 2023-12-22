import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		int value = Integer.parseInt(str1Ary[0]) + Integer.parseInt(str1Ary[1]);
		int keta = 1;
		while(true){
			if(value >= 10){
				value /= 10;
				keta++;
			}else{
				break;
			}
		}
		System.out.println(keta);
	}
}