import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());

			String[] stringArray = br.readLine().split(" ");

			ArrayList<String> list = new ArrayList<String>(n);

			for(String s: stringArray){
				list.add(s);
			}

			Collections.reverse(list);

			for(int i=0;i<n-1;i++){
				System.out.print(list.get(i) + " ");
			}
			System.out.print(list.get(n-1));

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}