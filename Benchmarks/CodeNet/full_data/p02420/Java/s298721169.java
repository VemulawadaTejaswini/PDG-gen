
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(true){
			str = br.readLine();
			if(str.equals("-")){
				break;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(str);
			int count = Integer.parseInt(br.readLine());

			for(int i = 0; i < count; i++){
				int indexNum = Integer.parseInt(br.readLine());

				sb.append(sb.substring(0, indexNum));
				sb.delete(0, indexNum);

			}
			System.out.println(sb.toString());
		}
	}
}