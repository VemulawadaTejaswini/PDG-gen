import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		int rank = 0;
		String[] look;
		boolean [] S = new boolean [13];
		boolean [] H = new boolean [13];
		boolean [] C = new boolean [13];
		boolean [] D = new boolean [13];

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int card = Integer.parseInt(br.readLine());

		for(int i = 0; i < card; i++){
			look = br.readLine().split(" ");
			rank = Integer.parseInt(look[1]);

			if(look[0].equals("S")){
				S[rank - 1] = true;
			}else if(look[0].equals("H")){
				H[rank - 1] = true;
			}else if(look[0].equals("C")){
				C[rank - 1] = true;
			}else if(look[0].equals("D")){
				D[rank - 1] = true;
			}
		}
		for(int s = 0; s < 13; s++){
			if(!S[s]){
				System.out.println("S" + " " + (s + 1));
			}
		}
		for(int s = 0; s < 13; s++){
			if(!H[s]){
				System.out.println("H" + " " + (s + 1));
			}
		}
		for(int s = 0; s < 13; s++){
			if(!C[s]){
				System.out.println("C" + " " + (s + 1));
			}
		}
		for(int s = 0; s < 13; s++){
			if(!D[s]){
				System.out.println("D" + " " + (s + 1));
			}
		}
	}
}