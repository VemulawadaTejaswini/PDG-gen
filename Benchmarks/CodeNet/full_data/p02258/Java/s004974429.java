import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		int max = 0;
		int min = 0;
		for(int i=0;i<times;i++){
			num[i] = scan.nextInt();
			
		}
		max = num[1] - num[0];
		min = num[0];
		for(int i=1;i<times;i++){
			if(max < num[i]-min){
				max = num[i]-min;
			}
			if(min > num[i]){
				min = num[i];
			}
		}
		System.out.println(max);
	}
}