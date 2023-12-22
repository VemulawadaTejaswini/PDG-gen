import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	private static int top3[];

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		top3 = new int[3];

		for(int i=0;i<10;i++){
			
			int h = Integer.parseInt(br.readLine());
			if(top3[0]<h){
				top3[2] = top3[1];
				top3[1] = top3[0];
				top3[0] = h;
			}
			else if(top3[1]<h){
				top3[2] = top3[1];
				top3[1] = h;
			}else if(top3[2]<h){
				top3[2] =h;
			}
		}
		for(int j=0;j<3;j++){
		 System.out.println(top3[j]);
		}
	}
}