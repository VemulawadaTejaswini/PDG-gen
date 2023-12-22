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
		int i;
		
		for(i = 0; i < numT; i ++ ){
			count = 0;
			while( count < numS ){
				if(arrayT[i] == arrayS[count]){
					match ++;
					break;
				}
				count ++;
			}
		}
		
		System.out.println(match);	
	}
}
