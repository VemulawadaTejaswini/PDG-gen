import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split(" ");
		Long [] numList = new Long[input.length];
		Long max = Long.parseLong(input[0]);
		int index = 0;
		int count = 0;
		boolean someFlag = true;
		for(String s : input) {
			numList[count] = Long.parseLong(s);
			if(max < numList[count] && max != numList[count]) {
				index = count;
				max = numList[count];
				someFlag = false;
			}
			count++;
		}
		Long comMulti = numList[0];
		Long resultMin = 0l;
		if(someFlag) {
			if(comMulti != 2) {
				resultMin = -1l;
			}else {
				resultMin = 2l;
			}
		}else {
			for(int i =1;i<index;i++) {
				if(comMulti%numList[i] != 0) {
					comMulti *= numList[i];
				}
			}
			Long mod = max%comMulti;
			resultMin = max + comMulti - mod;
		}
		Long temp = resultMin;
		for(int j=index;j<k;j++) {
			temp = temp - (temp%numList[j]);
		}
		if(temp != 2) {
			resultMin = -1l;
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