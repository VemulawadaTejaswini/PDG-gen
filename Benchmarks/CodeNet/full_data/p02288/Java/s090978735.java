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
		int tem = 0;
		int largest =0;
		for(int i=amount/2; i>0; i--){
			int left = i*2;
			int right = i*2+1;
			if(left <= amount && value[left] > value[i]){
				//???????????§??????
				largest = left;
			}
			else{
				largest = i;
			}
			if(right<=amount && value[right] > value[largest]){
				largest = right;
			}
			if(largest != i){
				tem = value[i];
				value[i] = value[largest];
				value[largest] = tem;
				i = largest+1 ;
			}
		}
		
		for (int i=1;i<=amount;i++){
			System.out.print(" "+value[i]);
		}
		System.out.println("");
	}
}