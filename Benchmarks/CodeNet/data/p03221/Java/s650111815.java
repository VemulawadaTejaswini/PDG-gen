import java.util.Scanner;

class city{
	
	int location;
	int year;
	
}


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		city[] city   = new city[M];
		
		for (int i = 0; i < M ;i++){
			city[i].location = scan.nextInt();
			city[i].year = scan.nextInt();
		}
		
		for  (int i = 0; i < M ;i++){
			int index =0 ;
	
			for  (int j = 0; j < M ;i++){
				if( (city[i].location == city[j].location) && (city[i].year > city[j].year)){
					index++;
				}
			}	
			System.out.println(String.format("%06d", city[i].location)+String.format("%06d", index));
		}
	}
}