import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			if(str == null || str.length() == 0){
				break;
			}
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
}