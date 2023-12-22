import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] card = new int[n];
			for(int i = 0;i < n;i++){
				card[i] = scan.nextInt();
			}
			for(int i = 1;i < n;i++){
				for(int k = 0;k < n;k++){
					System.out.print(card[k] + ((k==n-1)?"\n":" "));
				}
				int key = card[i];
				int j = i - 1;
				while(j >= 0 && card[j] > key){
					card[j+1] = card[j];
					j -= 1;
				}
				card[j+1] = key;
			}
			for(int k = 0;k < n;k++){
				System.out.print(card[k] + ((k==n-1)?"\n":" "));
			}
		}
	}
}