import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			int n = Integer.parseInt(br.readLine());
			ArrayList<String> list = new ArrayList<String>(n);
			String[] str = br.readLine().split(" ");

			for(String s1 : str){
				list.add(s1);
			}

			Collections.sort(list);

			for(String s2 : list){
				System.out.print(s2 + " ");
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}