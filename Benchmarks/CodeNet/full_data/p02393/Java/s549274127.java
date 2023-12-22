import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int data[] = new int[3];
			for(int i= 0; i < 3;i++){
				data[i] = scan.nextInt();
			}
			Arrays.sort(data);
			out.printf("%d %d %d", data[0],data[1],data[2]);
		}finally{
			if(scan !=null)scan.close();
		}

	}
}