import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> pourTimeList = new ArrayList<Integer>();
		while(stdIn.hasNext()){
			int add = stdIn.nextInt();
			if(add == 0){
				break;
			}
			pourTimeList.add(add);
		}
		Integer[] pourTimeArray = pourTimeList.toArray(new Integer[0]);
		Arrays.sort(pourTimeArray);
		int waitTime = 0;
		for(int i = 0;i < pourTimeArray.length - 1; i++){
			waitTime += pourTimeArray[i] * (pourTimeArray.length - i - 1);
		}
		System.out.println(waitTime);
	}
}