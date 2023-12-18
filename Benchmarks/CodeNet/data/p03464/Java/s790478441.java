import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split(" ");
		int [] numList = new int[input.length];
		int max = Integer.parseInt(input[0]);
		int index = 0;
		int count = 0;
		boolean someFlag = true;
		for(String s : input) {
			numList[count] = Integer.parseInt(s);
			if(max < numList[count] && max != numList[count]) {
				index = count;
				max = numList[count];
				someFlag = false;
			}
			count++;
		}
		int comMulti = numList[0];
		int resultMin = 0;
		if(someFlag) {
			if(comMulti != 2) {
				resultMin = -1;
			}else {
				resultMin = 2;
			}
		}else {
			for(int i =1;i<index;i++) {
				comMulti *= numList[i];
			}
			int mod = max%comMulti;
			resultMin = max + comMulti - mod;
		}
		int temp = resultMin;
		for(int j=index;j<k;j++) {
			temp = temp - (temp%numList[j]);
		}
		if(temp != 2) {
			resultMin = -1;
		}
		if(resultMin == -1) {
			System.out.println(resultMin);
		}else {
			if(resultMin != 2) {
				System.out.println(resultMin+" "+(resultMin+(k-1)-index));
			}else {
				System.out.println("2 3");
			}
		}
	}
}