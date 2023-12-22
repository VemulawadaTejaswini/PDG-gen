import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  numS = scanner.nextInt();//要素数
		int arrayS[] = new int[numS];
		
		for(int i = 0; i < numS; i ++ ){
			arrayS[i] = scanner.nextInt();
		}
		int  numT = scanner.nextInt();//要素数
		int arrayT[] = new int[numT];
		
		for(int i = 0; i < numT; i ++ ){
			arrayT[i] = scanner.nextInt();
		}
		
		LinearSearch(numS,arrayS,numT,arrayT);
		
		scanner.close();
	}
	
	public static void LinearSearch(int numS,int[] arrayS,int numT, int[] arrayT){ 
		int count = 0;
		int match = 0;
		int sub = 0;
		boolean shift = false;
		
		for(int i = 0; i < numT; i ++ ){
			count = 0;
			while( count < numS - match ){
				
				if(arrayT[i] == arrayS[count] && !shift){
					sub = arrayS[count];
					match ++;
					shift = true;
				}
				if( shift ){
					arrayS[count] = arrayS[count + 1];
				}
				count ++;
				if( shift && arrayS[count] == arrayS[count - 1] ){
					break;
				}
			}
			if( shift ){
				arrayS[count] = sub;
				shift = false;
			}
		}
		
		System.out.println(match);	
	}
}
