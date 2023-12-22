import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
      	Scanner scan = new Scanner(System.in);
		int zentai = scan.nextInt();
 		int kounyu = scan.nextInt();
        int[] priceArray = new int[zentai];
      int ans = 0;

		for(int i=0; i<zentai; i++){
			priceArray[i] = scan.nextInt();
			}
        Arrays.sort(priceArray);
      	for(int i=0; i<kounyu; i++){
			ans += priceArray[i];
			}

		System.out.println(ans);   
 
	}
}