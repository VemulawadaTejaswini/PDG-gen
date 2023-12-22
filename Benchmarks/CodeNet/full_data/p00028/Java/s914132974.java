import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] counts = new int[100];
		int max = 0;
		while(scan.hasNext()){
			int a = scan.nextInt();
			counts[a-1]++;
			if(max < counts[a-1]){
				max = counts[a-1];
			}
		}

		for(int i = 0; i < 100; i++){
			if(max == counts[i]){
				System.out.printf("%d\n", i+1);
			}
		}
	}
}