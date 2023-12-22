

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String in = br.readLine();
		String[] inArray = in.split(" ");

		for(int i=length-1; i>=0; i--){
			if(i == 0 ){
				System.out.println(inArray[0]);;
			}else{
			System.out.print(inArray[i]+" ");
			}
		}

	}

}