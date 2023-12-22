import java.io.*;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//b棟f階のr番目の部屋にv人
		Integer[][][] apartment = {{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
								   {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
								   {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
								   {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}};
		Integer line_num = Integer.parseInt(br.readLine());
		for(int i=0; i < line_num; i++){
			String input = br.readLine();
			String[] info = input.split(" ");
			Integer b = Integer.parseInt(info[0])-1;
			Integer f = Integer.parseInt(info[1])-1;
			Integer r = Integer.parseInt(info[2])-1;
			Integer v = Integer.parseInt(info[3]);
			apartment[b][f][r] = v;
		}
		for(int i=0; i < 4; i++){
			for(int j=0; j < 3; j++){
				for(int k=0; k < 10; k++){
					System.out.print(" " + apartment[i][j][k]);
				}
				System.out.print("\n");
			}
			if(i < 3){
				System.out.println("####################");
			}
		}
	}
}