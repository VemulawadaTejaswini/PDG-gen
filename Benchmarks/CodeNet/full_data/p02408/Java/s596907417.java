import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		int n = Integer.parseInt(line1);//1stLine
		int S[] = new int[13];
		int H[] = new int[13];
		int C[] = new int[13];
		int D[] = new int[13];
		for(int i = 0; i < 13; i++){
			S[i] = 0;
			H[i] = 0;
			C[i] = 0;
			D[i] = 0;
		}
		for(int j = 0; j < n; j++){
			String line = reader.readLine();//2nd-After-Line
			String[] sarray = line.split(" ", -1);
			int num = Integer.parseInt(sarray[1]);
			if(sarray[0] == "S"){
				S[num]++;
			} else if(sarray[0] == "H"){
				H[num]++;
			} else if(sarray[0] == "C"){
				C[num]++;
			} else if(sarray[0] == "D"){
				D[num]++;
			}
		}
		for(int k = 0; k < 4; k++){
			for(int l = 0; l < 13; l++){
				switch(k){
					case 0:
						if(S[k] == 0){
							System.out.println("S" + (l + 1));
						}
						break;
					case 1:
						if(H[k] == 0){
							System.out.println("H" + (k + 1));
						}
						break;
					case 2:
						if(C[k] == 0){
							System.out.println("C" + (k + 1));
						}
						break;
					default:
						if(D[k] == 0){
							System.out.println("S" + (k + 1));
						}
				}
			}
		}
	}
}