import java.util.Scanner;
import java.util.Arrays;
class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
		while(true){
			
			int num[] = new int[2];
			int num[0] = in.nextInt();
			int num[1] = in.nextInt();
			Array.Sort(num);
			if(num[0] == 0 && num[1] == 0){
				break;
			}
			System.out.println(num[0] + " " + num[1]);
		}
	}
}
