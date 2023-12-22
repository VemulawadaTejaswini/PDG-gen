import java.util.Scanner;

public class Main {
	
	public static int[] print_num = 
		{0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};
	
	public static int[] print_num2 = 
		{0,1,2,3,4,5,6,7,8,9,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			if(from > to){
				if(from <= 5){
					from = 15 - from;
					to = 15 - to;
				}else if(to <= 5){
					to = 15 - to;
				}else{
					to += 15;
				}
			}
			
			boolean first = true;
			for(int j = from; j <= to; j++){
				
				System.out.print((first ? "" : " ") + print_num2[j]);
				
				if(first){
					first = false;
				}
			}
			System.out.println();
		}
		
	}
	
}