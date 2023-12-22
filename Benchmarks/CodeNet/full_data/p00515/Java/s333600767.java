

import java.io.InputStreamReader;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????


InputStreamReader isr = new InputStreamReader(System.in);
	int ave,sum=0;
	Scanner sc = new Scanner(System.in);
	int[] data=new int[10];
	for(int i=0;i<5;i++){
		 data[i]=sc.nextInt();
		if(data[i]<40)data[i]=40;
	}
	for(int i=0;i<5;i++){
		sum+=data[i];
	}


	System.out.printf("%d\n", sum/5);



	}

}