import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num[] = new int[500];
		int i,Ntemp;
		String temp;

		try{
			for(i=0;;i++){
				temp=br.readLine();
				Ntemp = Integer.parseInt(temp);

				if(Ntemp == 0){
					break;
				}

				num[i] = Ntemp;
			}

			for(int j=0;j<i;j++){
				System.out.println("Case " + (j+1) + ": " + num[j]);
			}

		}catch(ArrayIndexOutOfBoundsException e){

		}
	}
}