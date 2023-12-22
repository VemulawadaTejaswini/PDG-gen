
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int hills[] = new int[9];

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0; i<10; ++i){
			hills[i] = Integer.parseInt(br.readLine());
		}

		int first = 0;
		int second = 0;
		int third = 0;

		// ????????????
		for(int i = 0; i<hills.length; ++i){

			// ?????????????±±
			if(first < hills[i]){
				first = hills[i];
			}
		}

		for(int i = 0; i<hills.length; ++i){

			// 2????????????????±±
			if(second < hills[i]){
				if(hills[i] != first){
					second = hills[i];
				}
			}
		}

		for(int i = 0; i<hills.length; ++i){

			// 3????????????????±±
			if(third < hills[i]){
				if(hills[i] != first && hills[i] != second){
					third = hills[i];
				}
			}
		}

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}