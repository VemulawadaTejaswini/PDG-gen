import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hour = 0;
		int minute = 0;

		int second = Integer.parseInt(br.readLine());
		if((second > 0) && (86400 > second)){

			if(second >= 60){
				minute = second / 60;
				second %= 60;
			}
			if(minute >= 60){
				hour = minute / 60;
				minute = minute % 60;
			}
		}

		System.out.println(hour + ":" + minute + ":" + second);
	}
}