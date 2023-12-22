import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n, judgeNum, count;
		
		count = 0;
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
		
			judgeNum = scan.nextInt();
			
			if(judgeNum == 2){
				count++;
			}
			
			for(int j = 2; j < judgeNum; j++){
				
				
				if(judgeNum % j == 0){
					break;
				}
				
				if(j == judgeNum - 1){
					count++;
				}	
			}	
		}
		
		System.out.println(count);
		
	}
}