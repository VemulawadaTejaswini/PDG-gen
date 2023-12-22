import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static final int MAX = 200000;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int highest =0;
		int middle =0;
		int lowest =0;

		for(int i =0 ; i<10; i++){

			int now = Integer.parseInt(br.readLine());
			if(highest <= now){
				lowest = middle;
				middle = highest;
				highest= now;
			/*	System.out.println("h");*/
			}else if (middle <= now) {
				lowest = middle;
				middle = now;
				/*System.out.println("m");*/
			}else if (lowest <= now) {
				lowest = now;
				/*System.out.println("l");*/

			}
			/*System.out.println(highest+"\n"+middle+"\n"+lowest);*/

		}

		System.out.println(highest+"\n"+middle+"\n"+lowest);

	}

}