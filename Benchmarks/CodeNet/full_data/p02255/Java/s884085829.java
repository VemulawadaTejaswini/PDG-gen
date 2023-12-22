
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] card = new int[n];
		
		for(int i=0;i<n;i++){
			card[i]=stdIn.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int minap = i;
			for(int j=i;j<n;j++){
				if(card[minap]>card[j]){
					minap = j;
				}
			}
			int tmp = card[i];
			card[i] = card[minap];
			card[minap] = tmp;
			print(card,n);
		}
		
	}
	
	private static void print(int card[],int n){
		for(int i=0;i<n-1;i++){
			System.out.print(card[i]+" ");
		}
		System.out.println(card[n-1]);
		
	}

}