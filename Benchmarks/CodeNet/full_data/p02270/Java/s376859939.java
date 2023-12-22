import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int CAPACITYMAX = 100000;

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sStr = br.readLine().split(" ");
		int weightCount = Integer.parseInt(sStr[0]);
		int truckCount = Integer.parseInt(sStr[1]);

		int[] weightAry = new int[weightCount];

		for(int i = 0 ; i < weightCount; i++){
			weightAry[i] = Integer.parseInt(br.readLine());
		}

		int max = CAPACITYMAX + 1;
		int mid = 0;
		int min = 0;
		int currentCap = 0;

		while(min < max){
			mid = (max+min) / 2;
			if(search(truckCount,weightAry,mid)){
				max = mid;
				currentCap = mid;
			}else{
				min = mid + 1;
			}
		}

		System.out.println(currentCap);

	}

	private static boolean search(int truckCount,int[] weightAry,int capacity){

		int weight = 0;
		int truckNo = 0;
		for(int i = 0; i < weightAry.length ; i++ ){
			weight += weightAry[i];
			if(capacity < weight){
				weight = 0;
				i--;
				truckNo++;
		    }
			if(truckCount < truckNo){
				break;
			}
		}
		if(truckNo < truckCount){
			return true;
		}

		return false;
   }
}