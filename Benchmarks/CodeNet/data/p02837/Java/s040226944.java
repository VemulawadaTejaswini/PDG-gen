
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int UNKNOWN = 0;
	static final int HONEST = 1;
	static final int DISKIND = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int input[][] = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			for(int j = 0; j < a; j++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt();
				
				if(y == 1) {
					input[i][x] = HONEST;
				}
				else {
					input[i][x] = DISKIND;
				}
			}
		}
		
		int result = 0;
		//全探索
loop:		for(int i = 0; i < (int)Math.pow(2, n) ; i++) {
			//debug
//			System.out.println("PATTERN");
			int tmp = i;
			
			boolean isHonest[] = new boolean[n];
			
			for(int j = 0; j < n; j++) {
				if(tmp % 2 == 1) {
//					System.out.print("O ");
					isHonest[j] = true;
				}
				else {
//					System.out.print("X ");
					isHonest[j] = false;
				}
				
				tmp /= 2;
			}
//			System.out.println();
			
			int num = i;
			int honestNum = 0;
			
//			Arrays.fill(isHonest, true);
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					
					if(isHonest[k] && input[k][j] == DISKIND) {
//						honestNum--;
//						System.out.println(k +" says "+j+" is diskind");
//						isHonest[k] = false;
						
						if(isHonest[j]) {
//							System.out.println("conflict!!");
							continue loop;
						}
					}
					
					if(isHonest[k] && input[k][j] == HONEST) {
//						honestNum--;
//						System.out.println(k +" says "+j+" is honest");
//						isHonest[k] = false;
						
						if(!isHonest[j]) {
//							System.out.println("conflict!!");
							continue loop;
						}
					}
//					else if(num%2 == 0 && input[k][j] == HONEST) {
//						System.out.println(k +" is diskind because of lying");
//						isHonest[k] = false;
//					}
//					else if(num%2 == 0 && j == k) {
//						honestNum--;
//						break;
//					}
				}
				
				num /= 2;
			}
			
			for(int j = 0; j < n; j++) {
				if(isHonest[j]) {
					honestNum++;
				}
			}
			
			result = Math.max(honestNum, result);
		}
		
		System.out.println(result);
	}

}
