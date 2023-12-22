import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String relationship = "==";
			
			if(a<b){relationship="<";}
			else if (a>b){relationship=">";}
			
			System.out.println("a "+(relationship)+" b");


		}  catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}



	}

}