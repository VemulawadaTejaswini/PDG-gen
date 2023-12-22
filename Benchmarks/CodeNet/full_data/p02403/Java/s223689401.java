import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int flag = 0;

		while(flag == 0){
			String inputData = br.readLine();
			String[] InputValue = inputData.split(" ");

			int h = Integer.parseInt(InputValue[0]);
			int w = Integer.parseInt(InputValue[1]);

			if(h == 0 && w == 0){
				flag ++;
				break;
			}else{
				for(int i = 0; i < h; i ++){
					for(int j = 0; j < w; j++){
						sb.append("#");
					}
					sb.append("\n");
				}
			}
			sb.append("\n");

		}
		System.out.println(sb);
	}

}