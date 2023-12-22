import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			List<Integer> pourTimeList = new ArrayList<Integer>();
			int count = stdIn.nextInt();
			if(count == 0){
				break;
			}
			for(int i = 0;i < count; i++){
				pourTimeList.add(stdIn.nextInt());
			}
			Collections.sort(pourTimeList);
			long waitTime = 0;
			for(int i = 0;i < pourTimeList.size() - 1; i++){
				waitTime += pourTimeList.get(i) * (pourTimeList.size() - i - 1);
			}
			System.out.println(waitTime);
		}
	}
}