import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0) break;

			int[][] data = new int[1000][4];
			//?????????????????????
			for(int i = 0; i < data.length ; i++){
				for(int j = 0; j < data[i].length; j++){
					data[i][j] = 0;
				}
			}

			//?????????????????????
			for(int i = 0; i < n ; i++){
				String[] tmpArray = br.readLine().split(" ");

				//int ID = Integer.parseInt(tmpArray[0]);
				for(int j = 0; j < 3; j++){

					data[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}

			//?????????????¨?
			//long[] result = new long[4001];
			ArrayList<SaleData> saleData = new ArrayList<SaleData>();

			/*
			for(int i = 0; i < result.length ; i++){
				result[i] = 0;
			}*/

			for(int i = 0; i < n; i++){

				//int remain = 1000000 - result[data[i][0]];

				/*
				if(remain <= 0){
					continue;
				}
				*/

				if(data[i][1] == 0){
					continue;
				}
				//int require = remain / data[i][1] + 1;

				//if(data[i][2] >= require){
					//result[data[i][0]] = 1000000;
				//}
				//else{

				//??¢?????????ID??§????´??????????????????????????????§????????????
				boolean exist = false;
				for(int j = 0; j < saleData.size(); j++){
					if(saleData.get(j).getId() == data[i][0]){
						saleData.get(j).addResult((long)data[i][1]*data[i][2]);
						exist = true;
						break;
					}
				}
				if(!exist){
					saleData.add(new SaleData(data[i][0], (long)data[i][1]*data[i][2]));
				}
				//	result[data[i][0]] += (long)data[i][1]*data[i][2];
				//}
			}

			//????????????
			int count = 0;
			for(int i = 0; i < saleData.size(); i++){
				if(saleData.get(i).getResult() >= 1000000){
					//System.out.println(i + "result "+result[i]);
					System.out.println(saleData.get(i).getId());
					count++;
				}
			}

			if(count == 0){
				System.out.println("NA");
			}
		}
	}

}

class SaleData {
	private int id;
	private long result;

	public SaleData (int id, long result){
		this.id = id;
		this.result = result;
	}

	public void addResult (long price){
		result += price;
	}

	public int getId (){
		return id;
	}
	public long getResult(){
		return result;
	}
}