import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int studentNum = 0;
		double scoreSum = 0;
		double scoreAverage = 0;
		double sigmaResult = 0;
		double alpha = 0;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			studentNum = Integer.parseInt(br.readLine());

			if(studentNum == 0){
				break;
			}
			
			int[] score =new int[studentNum];
			
			for (int i = 0;i < studentNum;i++){
				
				score[i] = Integer.parseInt(br.readLine());
				
				scoreSum =+ score[i];

				if(i == studentNum - 1){

					scoreAverage = scoreSum / studentNum;

					for (i = 0; i < score[i];i++) {

						double sigmaSum =+ ((score[i]) - scoreAverage) * ((score[i]) - scoreAverage);

						if(i == score[i] - 1){

							sigmaResult = sigmaSum / studentNum;

							alpha = Math.sqrt(sigmaResult);
						}
					}
				}
			}
			System.out.printf("% .8f\n", alpha);
		}

	}
}