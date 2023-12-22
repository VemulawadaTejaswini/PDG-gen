
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		int max = 1000;
		String[] result = new String [max];

		while ( i <= max && ((strLine = stdReader.readLine()) != null) ){

			if(i == 0){
				max = Integer.parseInt(strLine);

			}else{
				//??????????????§?????????
				String[] temp = strLine.split(" ",0);
				int[] tempInt = new int[3];
				tempInt[0] = Integer.parseInt(temp[0]);
				tempInt[1] = Integer.parseInt(temp[1]);
				tempInt[2] = Integer.parseInt(temp[2]);


				//????§???¢???????????????????????????????????????result???????´?
				result[i-1]=calc(tempInt);
				}

			i++;

		}


		//?????????????????????
		if(i > 1){
			for(int j = 0; j < max; j++){
				System.out.println(result[j]);
			}
		}

	}

	public static String calc(int[] tempInt){

		java.util.Arrays.sort(tempInt);

		if((tempInt[0]*tempInt[0])+(tempInt[1]*tempInt[1])==(tempInt[2]*tempInt[2])){

			return "YES";
		}else{
			return "NO";
		}


	}



}