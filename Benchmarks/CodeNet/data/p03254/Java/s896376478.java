import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Child_Num = scan.nextInt();
		int Candy_Num = scan.nextInt();
	
		int[] Wanted_Candy = new int[Child_Num] ;
				
		for (int i = 0; i<Child_Num; i++){
			Wanted_Candy[i] =  scan.nextInt();
		}
		
		Arrays.sort(Wanted_Candy);
		
		int Candy_Sum = 0;
		int j =0;
		while( (Candy_Sum + Wanted_Candy[j] <= Candy_Num) && j < Child_Num ){
			Candy_Sum = Candy_Sum + Wanted_Candy[j] ;
			j++;
		}
		if (j ==0){
			j=1;
		}
	
	System.out.println(j);
	
	}
}

