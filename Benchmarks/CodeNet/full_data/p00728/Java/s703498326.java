import java.io.*;

public class Main {

	public static void main(String[] args) {
		while(true){
			try{
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int number = Integer.parseInt(reader.readLine());
				if(number < 3){return;}
				int score[];
				score = new int[number];
				int i;
				for(i=0;i<number;i++){
					score[i] = Integer.parseInt(reader.readLine());
				}
				
				int max = 0;
				int maxJ = 0;
				int min = 1001;
				int minJ = 0;
				
				for(i=0;i<number;i++){
					if(max <= score[i]){
						max = score[i];
						maxJ = i;
					}
					if(score[i] <= min && i != maxJ){
						min = score[i];
						minJ = i;
					}
				}
				
				int sum = 0;
				for(i=0;i<number;i++){
					if(i != minJ && i != maxJ){
						sum += score[i];
					}
				}
				System.out.println(sum/(number-2));
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}
}