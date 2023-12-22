import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int count = 0;
		int index = 0;
		String[][] goodId = new String[1000][4000];
		while( n != 0 ){
			for(int i = 0; i < n; i++){
				String str = stdIn.next();
				long p = stdIn.nextLong();
				long q = stdIn.nextLong();
				if( p*q >= 1000000 ){
					goodId[index][count] = str;
					count++;
				}				
			}
			n = stdIn.nextInt();
			index++;
		}
		
		for(int i = 0; i < index; i++){
			if( goodId[i][0] == null ){
				System.out.println("NA");
				continue;
			} else {
				for(int j = 0; j < 4000; j++){
					if( goodId[i][j] == null ){
						break;
					} else {
						System.out.println(goodId[i][j]);
					}
				}
			}
		}
	}
}