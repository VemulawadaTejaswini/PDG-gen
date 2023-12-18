import java.util.Scanner;



class Main {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] location = new int[M];
		int[] year	   = new int[M];
				
	
		for (int i = 0; i < M ;i++){
			location[i] = scan.nextInt();
			year[i] = scan.nextInt();
		}
		
		for  (int i = 0; i < M ;i++){
			int index =1 ;
	
			for  (int j = 0; j < M ;j++){
				if( (location[i] == location[j]) && (year[i] > year[j])){
					index++;
				}
			}	
			System.out.println(String.format("%06d", location[i])+String.format("%06d", index));
		}
	}
}
