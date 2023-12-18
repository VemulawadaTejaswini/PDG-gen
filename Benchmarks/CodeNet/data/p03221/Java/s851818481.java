import java.util.Scanner;


public class cityname {
	int location = 0;
	int year = 0;
}

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		cityname[] city = new cityname[3];
		
		for (int i = 0; i < M ;i++){
			city[i] =  new cityname();
		}
		
		for (int i = 0; i < M ;i++){
			city[i].location = scan.nextInt();
			city[i].year = scan.nextInt();
		}
		
		for  (int i = 0; i < M ;i++){
			int index =1 ;
	
			for  (int j = 0; j < M ;j++){
				if( (city[i].location == city[j].location) && (city[i].year > city[j].year)){
					index++;
				}
			}	
			System.out.println(String.format("%06d", city[i].location)+String.format("%06d", index));
		}
	}
}
