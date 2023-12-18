

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] hw = str.split(" ");
		int h = Integer.parseInt(hw[0]);
		int w = Integer.parseInt(hw[0]);
		int count = 0;
		boolean start=false, end=false;
		for(int i=0; i<h; i++){
			str = input.readLine();
			if(i==0){
				if(str.startsWith("#")){
					start = true;
				}
			}
			if(i==h-1){
				if(str.endsWith("#")){
					end = true;
				}
			}

			count += str.length()-str.replace("#", "").length();
		}

		if(h+w-1==count && start && end){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}


	}

}
