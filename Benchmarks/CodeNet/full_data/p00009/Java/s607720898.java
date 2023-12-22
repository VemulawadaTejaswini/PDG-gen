import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int argsCnt = 0;
		int[] dataSet = new int[30];

		while ( ((strLine = stdReader.readLine()) != null)&&(!(strLine.equals("")))) {
			dataSet[argsCnt] = Integer.parseInt(strLine);
			argsCnt++;
		}

		int[] sosuCntArray = new int[argsCnt];


		for(int j = 0; j < argsCnt; j++){

			int sosuCnt = 0;
		

			for(int i = dataSet[j] ; 1 < i; i--){

				boolean sosuFlg = true;//?´???°??????true
				
				//dataSet[j]-1????´???°?????????
				for(int k = i-1 ; 1 <k ; k-- ){
					if ( i % k == 0){//?????????????????????(?´???°??§???????????????
						sosuFlg = false;
						break;

					}
				}

				//?´???°??????????????????????¶????
				if(sosuFlg == true){
					sosuCnt++;
				}

			}

			System.out.println(sosuCnt);
		}
	}

}