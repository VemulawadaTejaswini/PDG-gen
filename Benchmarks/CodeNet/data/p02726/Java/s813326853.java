import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tyouten = scan.nextInt();
		int from = scan.nextInt();
		int to = scan.nextInt();
		int result[] = new int[tyouten - 1];
		
		for(int i = 0; i < tyouten - 1; i++) {
			if(i < from) {
				for(int j = i + 1 ;j < tyouten; j++) {
					if(j < to - 1) {
						result[Math.min(j - i - 1,from - i - 1 + (to - 1 - j))]++;
					}else {
						result[j - i - (to - from - 1) - 1]++;
					}	
				}
				
			}else {
				for(int j = i + 1; j < tyouten; j++) {
					result[Math.min(j - i - 1,tyouten - to + 1 + (i - from))]++;
				}
				
			}
			
			
		}
		
		for(int data: result) {
			System.out.println(data);
			
		}
		
	}
	
}