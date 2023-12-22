import java.util.*;

public class Main{
	
	static int[] Revers(int[] Numbers , int n){
		
		for(int i = 0; i < n/2 ; i++){
			int t = Numbers[i];
			Numbers[i] = Numbers[n - i -1];
			Numbers[n - i - 1]= t;
		}
		return Numbers;
	}
	
	static int[] Input(){
		Scanner scanner = new Scanner(System.in);		
		int n 			= scanner.nextInt();
		int[] Numbers	= new int[n];
		for(int i = 0; i < n ; i++){
			Numbers[i] = scanner.nextInt();
		}
		scanner.close();
		return Revers(Numbers, n);
		
	}
	
	public static void main(String[] args) {
		int[] RN = Input();
		for(int i = 0 ; i < (RN.length-1) ; i++){
			System.out.print(RN[i] + " ");			
		}
		System.out.println(RN[RN.length-1]);
	}

}