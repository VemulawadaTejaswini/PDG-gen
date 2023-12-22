import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		
		for (int i = 0; i < 10000; ++i){
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String sNum = br.readLine();
			int iNum = Integer.parseInt(sNum);
			
			if (iNum == 0){
				return ;
			}
			
			System.out.println("Case "+ i + ": " + iNum);
		}
//		int[] data = new int[10000];
//		Arrays.fill(data, 0);
//		
//		for(int i = 0; i < 10000; i++){
//
//			BufferedReader br =
//					new BufferedReader(new InputStreamReader(System.in));
//
//			String sNum = br.readLine();
//			int iNum = Integer.parseInt(sNum);
//
//			if(iNum == 0 || (iNum < 1 || iNum > 10000)){
//				break;
//			}
//
//			data[i] = iNum;
//		}
//
//		for(int i = 0; i < data.length; i++){
//			if(data[i] == 0){
//				break;
//				
//			}
//			System.out.println("Case "+ i+1 + ": " + data[i]);
//		}
	}

}
//????????±???????£??????????????????????????????±???????????§??????????????????????????´??§????????????OJ?????§??????"Runtime Error"