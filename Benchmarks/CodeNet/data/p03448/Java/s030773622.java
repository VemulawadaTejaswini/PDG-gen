import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int A = Integer.parseInt(scanner.nextLine());; //500
		int B = Integer.parseInt(scanner.nextLine());; //100
		int C = Integer.parseInt(scanner.nextLine());; //50
		int X = Integer.parseInt(scanner.nextLine());; //total
		int count = 0;
		
		for(int a=0; a<=(A+1); a++){
			for(int b=0; b<=(B+1); b++){
				for(int c=0; c<=(C+1); c++){
					if(500*a + 100*b + 50*c == X){
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}