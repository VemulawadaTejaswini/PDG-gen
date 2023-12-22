import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] count = new int[100];
		int max = 0;
		while(scan.hasNext()){
			int a = scan.nextInt();
			count[a-1]++;
			if(count[a-1] > max){
				max = count[a-1]:
			}
		}

		for(int i = 0; i < 100; i++){
			if(count[i] == max){
				System.out.printf("%d\n", i+1);
			}
		}
	}
}