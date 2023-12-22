import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int n = Integer.parseInt(str);

		boolean cards[][] = new boolean[4][13];

		for(int i=0; i<4; i++){
			for(int j=0; j<13; j++){
				cards[i][j] = false;
			}
		}

		for(int i=0; i<n; i++){
			str = br.readLine();

			if((boolean)str.substring(0, str.indexOf(" ")).equals("S"))
				cards[0][Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()))-1] = true;

			if((boolean)str.substring(0, str.indexOf(" ")).equals("H"))
				cards[1][Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()))-1] = true;

			if((boolean)str.substring(0, str.indexOf(" ")).equals("C"))
				cards[2][Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()))-1] = true;

			if((boolean)str.substring(0, str.indexOf(" ")).equals("D"))
				cards[3][Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()))-1] = true;
		}

		for(int h=0; h<4; h++){
			for(int i=0; i<13; i++){
				if(!cards[h][i]){
					if(h==0)
						System.out.println("S " + (i+1));

					if(h==1)
						System.out.println("H " + (i+1));

					if(h==2)
						System.out.println("C " + (i+1));

					if(h==3)
						System.out.println("D " + (i+1));
				}
			}
		}
	}
}