import static java.lang.String.*;
import static java.lang.System.*;

import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			for(int z = 0; z != 3; z++){
				int[][] time = new int[2][3];
				for(int i = 0 ; i < time.length;i++){
					for(int j = 0 ;j < time[i].length;j++){
						time[i][j] = scan.nextInt();
					}
				}
				int[] sec = new int[2];
				for(int i = 0; i < 2;i++){
					sec[0] += time[0][i];
					sec[1] += time[1][i];
					sec[0] *= 60;
					sec[1] *= 60;
				}
				sec[0] += time[0][2];
				sec[1] += time[1][2];
				int second = sec[1] - sec[0];
				int hour = second /3600;
				second %= 3600;
				int minute = second /60;
				second %= 60;
				out.println(valueOf(hour)+" "+valueOf(minute) +" "+valueOf(second));
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}