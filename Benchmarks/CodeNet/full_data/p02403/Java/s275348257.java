import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int flag = 0;
		
		while(flag == 0){
			String inputData = br.readLine();
			String[] inputValue = inputData.split(" ");
			int[] outputData = new int[2];
			
			outputData[0] = Integer.parseInt(inputValue[0]);
			outputData[1] = Integer.parseInt(inputValue[1]);
			if(outputData[0] != 0 && outputData[1] != 0){
				for(int i = 0; i < outputData[0] ; i++){
					for(int j = 0; j < outputData[1] ; j ++){
						if(j != outputData[1] -1 ){
						System.out.print("#");
						}else{
							System.out.println("#");
							break;
						}
					}
				}
			}else{
				flag ++;
				System.out.println();
			}
		}
		
		
	}

}