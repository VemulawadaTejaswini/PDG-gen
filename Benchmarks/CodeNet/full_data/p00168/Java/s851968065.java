import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		long[] list = new long[31];
		list[0] = 1;
		list[1] = 1;
		list[2] = 2;
		list[3] = 4;
		for(int i=4; i<31; i++){
			list[i] = list[i-1]+list[i-2]+list[i-3];
		}
		for(int i=0; i<31; i++){
			list[i] = (list[i]-list[i]%10)/10+1;
			list[i] = (list[i]-list[i]%365)/365+1;
		}
		while(true){
			int N = bf.nextInt();
			if(N==0) break;
			System.out.println(list[N]);
		}
	}
}