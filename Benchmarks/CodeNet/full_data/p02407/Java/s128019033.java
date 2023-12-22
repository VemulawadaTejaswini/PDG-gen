import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		int num;
		String[] str;
		List<Integer> list;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		num = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");

		list =  new ArrayList<Integer>(){
			{
				for(int i = 0; i < num; i++){
					add(Integer.parseInt(str[i]));
				}
			}
		};

		Collections.reverse(list);
		for(int i: list){
			builder.append(String.valueOf(i + " "));
		}
		builder.delete(builder.length() - 1, builder.length());

		System.out.println(builder);
		br.close();
	}
}