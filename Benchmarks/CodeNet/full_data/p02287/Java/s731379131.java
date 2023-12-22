import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		int[] value = new int[amount+1];
		for (int i=1;i<amount+1;i++){
			value[i]=scan.nextInt();
		}
		for(int i=1;i<amount+1;i++){
			int calc =0;
			System.out.print("node "+i+": key = "+value[i]+", ");
			if(i != 1){
				calc = i/2;
				System.out.print("parent key = "+value[calc]+", ");
			}
			if(i*2+1 <= amount){
				calc = i*2;
				System.out.print("left key = "+value[calc]+", ");
				calc = i*2+1;
				System.out.print("right key = "+value[calc]+", ");
			}
			System.out.println("");
		}
	}
}