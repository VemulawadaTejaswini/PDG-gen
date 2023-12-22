import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i=0;
		int[] dataSet = new int[10000];
		while(i<10000){
			dataSet[i] = scan.nextInt();
			if(dataSet[i]==0){
				break;
			}
			i++;
		}
		for(int j=0;j<=i;j++){
			System.out.println("case "+(j+1)+": "+ dataSet[j]);
		}
	}
}